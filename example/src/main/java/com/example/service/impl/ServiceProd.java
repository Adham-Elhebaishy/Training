package com.example.service.impl;

import com.example.entity.Employee;
import com.example.service.IService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ServiceProd implements IService {
    @Override
    public String getTheEnvironment() {
        return "ServiceProd";
    }

    @Override
    public Employee getEmployee(int id) {
        return null;
    }

    @Override
    public void saveEmployee() {

    }
}
