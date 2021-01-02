package com.ticketing.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/task")
public class TaskController {
//
//    ProjectService projectService;
//    UserService userService;
//    TaskService taskService;
//
//    @Autowired
//    public TaskController(ProjectService projectService, UserService userService, TaskService taskService){
//        this.projectService = projectService;
//        this.userService = userService;
//        this.taskService = taskService;
//    }
//
//    @GetMapping("create")
//    public String createTask(Model model){
//
//        model.addAttribute("task", new TaskDTO());
//        model.addAttribute("projectList", projectService.findAll());
//        model.addAttribute("employeeList", userService.findEmployees());
//        model.addAttribute("taskList", taskService.findAll());
//        return "task/create";
//    }
//
//
//    @PostMapping("create")
//    public String postTask(Model model, TaskDTO task){
//
//        task.setTaskStatus(Status.OPEN);
//        task.setAssignedDate(LocalDate.now());
//        task.setId(UUID.randomUUID().getMostSignificantBits());
//        taskService.save(task);
//        return "redirect:/task/create";
//    }
//
//    @GetMapping("/delete/{id}")
//    public String deleteTask(@PathVariable("id") Long id) {
//
//        taskService.deleteByID(id);
//        return "redirect:/task/create";
//    }
//
//    @GetMapping("/update/{id}")
//    public String editTask(@PathVariable("id") Long id, Model model){
//
//        model.addAttribute("task",taskService.findByID(id));
//        model.addAttribute("projectList",projectService.findAll());
//        model.addAttribute("employeeList",userService.findEmployees());
//        model.addAttribute("taskList",taskService.findAll());
//        return "task/update";
//    }
//
//    @PostMapping("/update/{id}")
//    public String updateTask(TaskDTO task){
//
//        taskService.update(task);
//        return "redirect:/task/create";
//    }

}
