package com.test.jasper.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.jasper.entities.Employee;
import com.test.jasper.services.EmployeeReportService;
import com.test.jasper.services.EmployeeService;

import net.sf.jasperreports.engine.JRException;

@RestController
public class EmployeeController {
    

    @Autowired
    EmployeeReportService employeeReportService;

    @Autowired
    EmployeeService employeeService;

    @GetMapping("employees")
    public List<Employee> getEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("report")
    public void reportGenerate() throws JRException{
        employeeReportService.generateEmployeeReport();
    }

}
