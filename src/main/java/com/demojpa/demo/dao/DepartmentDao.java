package com.demojpa.demo.dao;

import com.demojpa.demo.entity.Department;
import com.demojpa.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class DepartmentDao {

    @Autowired
    private DepartmentRepository departmentRepository;

    public String saveDepartment(Department department){
        departmentRepository.save(department);
        return "Department Saved Successfully";
    }

    public Optional<Department> fetchDept(Long id){
        return departmentRepository.findById(id);
    }
}
