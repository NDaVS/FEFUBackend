package com.example.backend_spring.Task.DTO;

import com.example.backend_spring.Task.Task;
import com.example.backend_spring.Task.TaskService;
import org.springframework.stereotype.Service;

@Service
public class DTOAll {
    private Long id;
    private String title;
    private String desc;
    private Integer status;


    public void addValue(Long taskId, String title, String desc, Integer status) {
        this.id = taskId;
        this.title = title;
        this.desc = desc;
        this.status = status;
    }

    public void setId(Long id){
        this.id = id;
    }
    public void setText(String title, String desc){
        this.title = title;
        this.desc = desc;
    }

    public void setStatus(Integer status){
        this.status = status;
    }

    public Long getId(){return id;}
    public String getTitle(){return title;}
    public String getDesc(){return desc;}
    public Integer getStatus(){return status;}

    public Task toTask(){

        Task task = new Task(id, title, desc, status);
        return task;
    }
}
