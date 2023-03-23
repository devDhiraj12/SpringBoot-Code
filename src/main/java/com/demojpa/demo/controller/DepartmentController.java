package com.demojpa.demo.controller;

import com.demojpa.demo.dao.DepartmentDao;
import com.demojpa.demo.entity.Department;
import com.fasterxml.jackson.core.PrettyPrinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentDao departmentDao;

    @PostMapping("/saveDept")
    public String saveDept(@RequestBody Department department){
        return departmentDao.saveDepartment(department);
    }

    @GetMapping("/fetchDepartment/{deptId}")
    public Optional<Department> getDept(@PathVariable Long deptId){
        return departmentDao.fetchDept(deptId);
    }
}
