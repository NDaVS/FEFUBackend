package com.example.backend_spring.Task.DTO;

import com.example.backend_spring.Task.Task;
import org.springframework.stereotype.Service;

@Service
public class DTOText {
    private Long id;
    private String title;
    private String desc;
    private Integer status;

    public void addValue(Long taskId, String title, String desc) {
        this.id = taskId;
        this.title = title;
        this.desc = desc;
    }

    public void setText(String title, String desc){
        this.title = title;
        this.desc = desc;
    }

    public Long getId(){return id;}
    public String getTitle(){return title;}
    public String getDesc(){return desc;}
}
