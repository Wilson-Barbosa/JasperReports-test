package com.test.jasper.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.jasper.entities.Employee;
import com.test.jasper.repositories.EmployeeRepository;

@RestController
@RequestMapping("employees")
public class TestController {
    
    @Autowired
    private EmployeeRepository employeeRepository;


    @GetMapping()
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }


}
