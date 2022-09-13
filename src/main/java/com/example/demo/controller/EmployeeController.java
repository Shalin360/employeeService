package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepo employeeRepo;

    @GetMapping(path = "/employees")
    public List<Employee> getAllEmployees(){
        List<Employee> emp = employeeRepo.findAll();
        return emp;
    }
    @GetMapping(path="/employee")
    public Employee getEmployee(){
        return new Employee("24","koinworx");
    }

    @PostMapping(value="/create")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeRepo.insert(employee);
    }

}
