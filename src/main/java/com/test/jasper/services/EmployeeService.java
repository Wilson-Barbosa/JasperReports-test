package com.test.jasper.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.jasper.entities.Employee;
import com.test.jasper.repositories.EmployeeRepository;


@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    // Method to retrieve a list of employees from the database
    public List<Employee> getAllEmployees() {

        // Creates an empty EmployeeList
        List<Employee> employeeList = new ArrayList<>();

        // Assigns the search result to my list
        employeeList = employeeRepository.findAll();

        return employeeList;

    }
}
