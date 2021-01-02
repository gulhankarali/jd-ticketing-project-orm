package com.cybertek.controller;

import com.cybertek.dto.ProjectDTO;
import com.cybertek.dto.TaskDTO;
import com.cybertek.dto.UserDTO;
import com.cybertek.enums.Status;
import com.cybertek.service.ProjectService;
import com.cybertek.service.TaskService;
import com.cybertek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@Component
@RequestMapping("/project")
public class ProjectController {

    ProjectService projectService;
    UserService userService;
    TaskService taskService;

    @Autowired
    ProjectController(ProjectService projectService, UserService userService, TaskService taskService){
        this.projectService = projectService;
        this.userService = userService;
        this.taskService = taskService;
    }

    @GetMapping({"/create"})
    public String createProject(Model model) {
        model.addAttribute("project", new ProjectDTO());
        model.addAttribute("projectList", projectService.findAll());
        model.addAttribute("managerList", userService.findManagers());
        return "project/create";
    }

    @PostMapping("/create")
    public String postProject(@ModelAttribute("project") ProjectDTO project) {
        projectService.save(project);
        project.setStatus(Status.OPEN);
        return "redirect:/project/create";
    }

    @GetMapping("/delete/{projectCode}")
    public String deleteProject(@PathVariable("projectCode") String projectCode) {
        projectService.deleteByID(projectCode);
        return "redirect:/project/create";
    }


    @GetMapping("/complete/{projectCode}")
    public String completeProject(@PathVariable("projectCode") String projectCode){

        projectService.complete(projectService.findByID(projectCode));
        return "redirect:/project/create";
    }



    @GetMapping("/update/{projectCode}")
    public String editProject(@PathVariable("projectCode") String projectCode , Model model) {

        model.addAttribute("project", projectService.findByID(projectCode));
        model.addAttribute("projectList", projectService.findAll());
        model.addAttribute("managerList", userService.findManagers());
        return "/project/update";
    }

    @PostMapping("/update/{projectCode}")
    public String updateProject(@PathVariable("projectCode") String projectCode, ProjectDTO project) {

        projectService.update(project);
        return "redirect:/project/create";
    }

    @GetMapping("/manager/complete")
    public String getProjectByManager(Model model){

        UserDTO manager = userService.findByID("john@cybertek.com");

        List<ProjectDTO> projectList = getCountListOfProjects(manager);

        model.addAttribute("projectList",projectList);
        return "/manager/project-status";
    }

    List<ProjectDTO> getCountListOfProjects(UserDTO manager){
        List<ProjectDTO> list = projectService
                .findAll()
                .stream()
                .filter(x -> x.getAssignedManager().equals(manager))
                .map(x -> {

                    List<TaskDTO> taskList = taskService.findTaskByManager(manager);
                    int completeCount = (int) taskList.stream().
                            filter(t -> t.getProject().equals(x) && t.getTaskStatus() == Status.COMPLETE).count();
                    int incompleteCount = (int) taskList.stream().
                            filter(t -> t.getProject().equals(x) && t.getTaskStatus() != Status.COMPLETE).count();

                    x.setCompleteTaskCount(completeCount);
                    x.setUnfinishedTaskCount(incompleteCount);

                    return x;

                }).collect(Collectors.toList());
        return list;
    }
}
