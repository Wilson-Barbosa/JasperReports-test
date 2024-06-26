package com.test.jasper.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.jasper.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Integer> {
    
}
