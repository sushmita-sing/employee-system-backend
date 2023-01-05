package com.fullstack.employeesystem.services;

import com.fullstack.employeesystem.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    boolean deleteEmployee(Long id);
}
