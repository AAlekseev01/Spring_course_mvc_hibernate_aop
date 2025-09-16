package com.alekseevandrey.spring.mvc_hibernate_aop.service;

import com.alekseevandrey.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeSevice {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);
}
