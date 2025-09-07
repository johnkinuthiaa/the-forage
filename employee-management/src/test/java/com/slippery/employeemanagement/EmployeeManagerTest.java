package com.slippery.employeemanagement;

import com.slippery.employeemanagement.dto.EmployeeResponse;
import com.slippery.employeemanagement.models.Employee;
import com.slippery.employeemanagement.service.impl.EmployeeManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.mockito.BDDMockito.given;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class EmployeeManagerTest {
    private static final Logger log = LoggerFactory.getLogger(EmployeeManagerTest.class);
    @Mock
    private Employee employee;

    @Mock
    private EmployeeResponse employeeResponse;
    @InjectMocks
    private EmployeeManager employeeManager;

    @Test
    void getEmployeeList(){
        List<Employee> employeeList =employeeManager.getEmployeeList();
        assertThat(employeeList).isNotEmpty();

    }
    @Test
    void addOneEmployee(){
        employee.setEmail("mail@gmail.com");
        employee.setEmployeeId("qwert");
        employee.setFirstName("New");
        employee.setLastName("Employee");
        EmployeeResponse response =employeeManager.addOneEmployee(employee);
        assertThat(response.getStatusCode()).isEqualTo(201);
        log.info("{}",response.getStatusCode());

    }

}
