package com.slippery.employeemanagement.controller;

import com.slippery.employeemanagement.dto.EmployeeResponse;
import com.slippery.employeemanagement.service.EmployeeService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
@CrossOrigin("*")
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }
    @GetMapping
    public ResponseEntity<EmployeeResponse> getAllEmployees(){
        EmployeeResponse allEmployees =service.getAllEmployees();
        return ResponseEntity.status(HttpStatusCode.valueOf(allEmployees.getStatusCode())).body(allEmployees);
    }
}
