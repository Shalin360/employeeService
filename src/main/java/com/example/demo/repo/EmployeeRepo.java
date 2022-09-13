package com.example.demo.repo;

import com.example.demo.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EmployeeRepo extends MongoRepository<Employee,String> {

    public List<Employee> findAll();

    public Employee insert(Employee employee);
}


