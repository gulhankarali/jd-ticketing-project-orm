package com.cybertek.implementation;

import com.cybertek.dto.ProjectDTO;
import com.cybertek.dto.TaskDTO;
import com.cybertek.dto.UserDTO;
import com.cybertek.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskServiceImpl extends AbstractMapService<TaskDTO, Long> implements TaskService {
    @Override
    public List<TaskDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteByID(id);
    }

    @Override
    public void delete(TaskDTO object) {
        super.delete(object);
    }

    @Override
    public TaskDTO save(TaskDTO object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void update(TaskDTO object) {
        TaskDTO newTask = findByID(object.getId());
        if (object.getTaskStatus()==null){
            object.setTaskStatus(newTask.getTaskStatus());
            object.setAssignedDate(newTask.getAssignedDate());
        }
        super.update(object.getId(),object);
    }

    @Override
    public TaskDTO findByID(Long id) {
        return super.findByID(id);
    }


    @Override
    public List<TaskDTO> findTaskByManager(UserDTO manager) {
        return super.findAll().stream().filter(task -> task.getProject().getAssignedManager().equals(manager)).collect(Collectors.toList());

    }
}
