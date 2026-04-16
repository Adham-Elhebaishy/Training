package com.example.service;

import com.example.entity.Employee;

public interface IService {

    String getTheEnvironment();
    Employee getEmployee(int id);
    void saveEmployee();

}
