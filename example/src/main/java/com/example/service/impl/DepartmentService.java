package com.example.service.impl;

import com.example.entity.Department;
import com.example.repository.DepartmentRepository;
import com.example.service.IDepartmentService;
import jakarta.transaction.Transactional;

public class DepartmentService implements IDepartmentService {

    private final DepartmentRepository departmentRepository;
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }
    @Override
    @Transactional
    public void AddDepartment(Department department) {
        departmentRepository.save(department);

    }

    @Override
    @Transactional
    public void UpdateDepartment(Department department) {
        departmentRepository.save(department);
    }

    @Override
    @Transactional
    public void DeleteDepartment(Department department) {
        departmentRepository.delete(department);
    }
}
