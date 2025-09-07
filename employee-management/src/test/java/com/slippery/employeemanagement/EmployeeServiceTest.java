package com.slippery.employeemanagement;

import com.slippery.employeemanagement.dto.EmployeeResponse;
import com.slippery.employeemanagement.models.Employee;
import com.slippery.employeemanagement.service.EmployeeService;
import com.slippery.employeemanagement.service.impl.EmployeeManager;
import com.slippery.employeemanagement.service.impl.EmployeeServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {
    private static final Logger log = LoggerFactory.getLogger(EmployeeServiceTest.class);
    @Mock
    private EmployeeResponse employeeResponse;
    @Mock
    private Employee employee;
    @Mock
    private EmployeeManager employeeManager;
    @InjectMocks
    private EmployeeServiceImpl employeeService;

    @Test
    void getAllEmployees(){
        EmployeeResponse employeeResponse=employeeService.getAllEmployees();
        assert (employeeResponse !=null);
        assert (employeeResponse.getStatusCode() ==200);
        List<Employee> allEmployees =employeeResponse.getEmployees();
        assertThat(allEmployees).isNotNull();
    }

}
