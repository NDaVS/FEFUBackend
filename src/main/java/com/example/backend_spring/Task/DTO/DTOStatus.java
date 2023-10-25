package com.example.backend_spring.Task.DTO;

import com.example.backend_spring.Task.Task;
import org.springframework.stereotype.Service;

@Service
public class DTOStatus {
    private Long id;

    private Integer status;

    public void addValue(Long taskId, Integer status) {
        this.id = taskId;

        this.status = status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getId(){return id;}
    public Integer getStatus() {
        return status;
    }
}
