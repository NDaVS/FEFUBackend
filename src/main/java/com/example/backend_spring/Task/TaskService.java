package com.example.backend_spring.Task;

import com.example.backend_spring.Task.DTO.DTOAll;
import com.example.backend_spring.Task.DTO.DTOStatus;
import com.example.backend_spring.Task.DTO.DTOText;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final DATA data;

    public TaskService(DATA data) {
        this.data = data;
        data.addTask(new Task(
                1L,
                "home work",
                "do backend",
                1
        ));
    }

    public List<Task> getTasks(){
        return data.getTasks();
    }
    public void addNewTask(DTOAll dtoAll){
        data.addTask(dtoAll.toTask());
    }

    public void deleteTask(Long taskId){
        data.deleteTask(taskId);
    }
    public void updateFullTask(DTOAll dtoAll){
        data.updateFullTask(dtoAll.toTask());
    }
    public void updateTaskText(DTOText dtoText){
        data.updateTaskText(dtoText);
    }
    public void updateTaskStatus(DTOStatus dtoStatus){
        data.updateTaskStatus(dtoStatus);
    }
}
