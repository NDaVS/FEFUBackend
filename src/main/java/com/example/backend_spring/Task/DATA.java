package com.example.backend_spring.Task;

import com.example.backend_spring.Task.DTO.DTOStatus;
import com.example.backend_spring.Task.DTO.DTOText;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class DATA {
    private static List<Task> tasks = new ArrayList<>();
    public DATA() {
         ;
    }
    public void addTask(Task task){
        tasks.add(task);
    }
    public void deleteTask(Long taskId){
        for (Task task: tasks){
            if (task.getId().equals(taskId)){
                tasks.remove(task);
                return;
            }
        }
        throw new IllegalStateException("task with id = " + taskId + " does not exists");
    }
    public List<Task> getTasks(){
        return tasks;
    }
    public void updateFullTask(Task newTask){
        for (Task task: tasks){
            if (task.getId().equals(newTask.getId())){
                task.setTitle(newTask.getTitle());
                task.setDesc(newTask.getDesc());
                task.setStatus(newTask.getStatus());
                return;
            }
        }
        throw new IllegalStateException("incorrect input data");
    }

    public void updateTaskText(DTOText dtoText){
        for (Task task: tasks){
            if (task.getId().equals(dtoText.getId())){
                task.setTitle(dtoText.getTitle());
                task.setDesc(dtoText.getDesc());
                return;
            }
        }
        throw new IllegalStateException("task with id = " + dtoText.getId() + " does not exists");
    }

    public void updateTaskStatus(DTOStatus dtoStatus){
        for (Task task: tasks){
            if (task.getId().equals(dtoStatus.getId())){
                task.setStatus(dtoStatus.getStatus());
                return;
            }
        }
        throw new IllegalStateException("task with id = " + dtoStatus.getId() + " does not exists");
    }
}
