package com.demojpa.demo.controller;

import com.demojpa.demo.dao.EmployeeDao;
import com.demojpa.demo.dto.EmployeeDto;
import com.demojpa.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @PostMapping("/saveEmployee")
    public String saveEmp(@RequestBody Employee employee){

        return employeeDao.saveEmployee(employee);
    }

    @PostMapping("/saveEmpList")
    public String saveMultipleEmp(@RequestBody EmployeeDto employeeDto){

        employeeDto.getEmployeeList().forEach(emp->{
             Employee employee=new Employee();
             employee.setEmpCode(emp.getEmpCode());
             employee.setEmpName(emp.getEmpName());
             employee.setDepartment(employeeDto.getDepartment());
            employeeDao.saveEmployee(employee);
        });

        return "Employees Saved!!!";
    }
}
