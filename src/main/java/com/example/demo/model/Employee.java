package com.example.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Employee {

    @Id
    private String id;
    private String name;

    public Employee(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
}
