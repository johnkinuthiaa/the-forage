package com.slippery.employeemanagement.service;

import com.slippery.employeemanagement.dto.EmployeeResponse;
import com.slippery.employeemanagement.models.Employee;

public interface EmployeeService {
    EmployeeResponse getAllEmployees();
    EmployeeResponse addNewEmployee(Employee employee);
}
