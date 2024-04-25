package com.test.jasper.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.jasper.entities.Employee;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class EmployeeReportService {

    @Autowired
    EmployeeService employeeService;

    // Method that generates the report
    public void generateEmployeeReport() throws JRException {

        // List of Employees
        List<Employee> employeeList = employeeService.getAllEmployees();

        // Defining the path of my template
        String templatePath = "src/main/resources/templates/employeeListReportTemplate.jrxml";

        // Defining the directory where my .pdf will be stored
        String directoryPath = "src/main/resources/static/employeeReport.pdf";

        // Creating a DataSource and populating it with my employeeList
        JRBeanCollectionDataSource employeeDataSource = new JRBeanCollectionDataSource(employeeList);

        // Adding the employeeDataSource to my parameters
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("employeeDataSet", employeeDataSource);

        // I need to compile the template into a proper JasperReport object
        JasperReport report = JasperCompileManager.compileReport(templatePath);

        // Now I can populate the compiled report with information inside my dataSource
        JasperPrint print = JasperFillManager.fillReport(report, parameters, new JREmptyDataSource());

        // Exporting ther printFile to a actual .pdf file
        JasperExportManager.exportReportToPdfFile(print, directoryPath);

        System.out.println("The report was generated with success");

    }

}
