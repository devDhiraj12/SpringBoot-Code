package com.demojpa.demo.dao;

import com.demojpa.demo.entity.Employee;
import com.demojpa.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

    @Autowired
    private EmployeeRepository employeeRepository;

    public String saveEmployee(Employee employee){
        employeeRepository.save(employee);
        return "Employee Added Successfully!!!";
    }
}
