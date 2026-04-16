package com.example.service.impl;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;
import com.example.service.IService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;


@org.springframework.stereotype.Service
@RequiredArgsConstructor
@Profile("!dev &  !prod")
public class Service implements IService {
    private final EmployeeRepository employeeRepository;

    @Override
    public String getTheEnvironment() {
        return "PublicService";
    }

    @Override
    public Employee getEmployee(int id) {
        return  employeeRepository.findById(id).orElse(null);

    }
    @Transactional
    public void saveEmployee() {
        employeeRepository.save(Employee.builder()
                .id(1)
                .email("Amr@gmail.com")
                .firstName("Amr")
                .lastName("elhady")
                .build());

    }
}
