package com.demojpa.demo.controller;

import com.demojpa.demo.dao.DepartmentDao;
import com.demojpa.demo.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentDao departmentDao;

    @PostMapping("/saveDept")
    public String saveDept(@RequestBody Department department){
        return departmentDao.saveDepartment(department);
    }
}
