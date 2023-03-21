package com.demojpa.demo.dto;


import com.demojpa.demo.entity.Department;
import com.demojpa.demo.entity.Employee;

import java.util.List;

public class EmployeeDto {

    private Department department;

    private List<EmployeeData> employeeList;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<EmployeeData> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<EmployeeData> employeeList) {
        this.employeeList = employeeList;
    }
}
