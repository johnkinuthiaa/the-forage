package com.slippery.employeemanagement.service.impl;

import com.slippery.employeemanagement.dto.EmployeeResponse;
import com.slippery.employeemanagement.models.Employee;
import com.slippery.employeemanagement.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeManager employeeManager;

    public EmployeeServiceImpl(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }
    @Override
    public EmployeeResponse getAllEmployees() {
        EmployeeResponse response =new EmployeeResponse();
        response.setMessage("All employees");
        response.setStatusCode(200);
        response.setEmployees(employeeManager.getEmployeeList());
        return response;
    }
}
