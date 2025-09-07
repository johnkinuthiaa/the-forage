package com.slippery.employeemanagement.controller;

import com.slippery.employeemanagement.dto.EmployeeResponse;
import com.slippery.employeemanagement.models.Employee;
import com.slippery.employeemanagement.service.EmployeeService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping
    public ResponseEntity<EmployeeResponse> addEmployee(@RequestBody Employee employee){
        EmployeeResponse newEmployee =service.addNewEmployee(employee);
        return ResponseEntity.status(HttpStatusCode.valueOf(newEmployee.getStatusCode())).body(newEmployee);
    }
}
