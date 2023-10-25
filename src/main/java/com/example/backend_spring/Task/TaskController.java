package com.example.backend_spring.Task;

import com.example.backend_spring.Task.DTO.DTOAll;
import com.example.backend_spring.Task.DTO.DTOStatus;
import com.example.backend_spring.Task.DTO.DTOText;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/task")
public class TaskController {
    private final TaskService taskService;
    private final DTOAll dtoAll;
    private final DTOText dtoText;
    private final DTOStatus dtoStatus;

    public TaskController(TaskService taskService, DTOAll dtoAll, DTOText dtoText, DTOStatus dtoStatus) {
        this.taskService = taskService;
        this.dtoAll = dtoAll;
        this.dtoText = dtoText;
        this.dtoStatus = dtoStatus;
    }

    @GetMapping
    public List<Task> getTasks(){
        return taskService.getTasks();
    }

    @PostMapping
    public void addNewTask(@RequestBody Task task){
        dtoAll.addValue(task.getId(), task.getTitle(), task.getDesc(), task.getStatus());
        taskService.addNewTask(dtoAll);
    }

    @DeleteMapping(path = "{taskId}")
    public void deleteTask(@PathVariable("taskId") Long taskId){
        taskService.deleteTask(taskId);
    }

    @PutMapping(path = "{taskId}")
    public void updateTask(
            @PathVariable("taskId") Long taskId,
            @RequestParam(required = false) String title,
            @RequestParam(required = false) String desc,
            @RequestParam(required = false) Integer status
            ){
        if (title != null && desc != null && status!=null) {
            dtoAll.addValue(taskId, title, desc, status);
            taskService.updateFullTask(dtoAll);
        }
        if (title != null && desc != null){
            dtoText.addValue(taskId, title, desc);
            taskService.updateTaskText(dtoText);
        }
        if (status != null) {
            dtoStatus.addValue(taskId,status);
            taskService.updateTaskStatus(dtoStatus);
        }
    }

}
