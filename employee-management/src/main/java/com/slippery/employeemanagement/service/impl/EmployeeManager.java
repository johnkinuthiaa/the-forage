package com.slippery.employeemanagement.service.impl;

import com.slippery.employeemanagement.models.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeManager {
    List<Employee> employeeList = new ArrayList<>();

    private void addEmployees(){

        UUID id =UUID.randomUUID();
        Employee employee1 = new Employee();
        employee1.setEmployeeId(UUID.randomUUID().toString());
        employee1.setFirstName("John");
        employee1.setLastName("king");
        employee1.setEmail("john.king@example.com");
        employee1.setTitle("Software Engineer");

        // Employee 2
        Employee employee2 = new Employee();
        employee2.setEmployeeId(UUID.randomUUID().toString());
        employee2.setFirstName("milly");
        employee2.setLastName("hin");
        employee2.setEmail("millyh@example.com");
        employee2.setTitle("Product Manager");

        // Employee 3
        Employee employee3 = new Employee();
        employee3.setEmployeeId(UUID.randomUUID().toString());
        employee3.setFirstName("Peter");
        employee3.setLastName("Jones");
        employee3.setEmail("peter.jones@example.com");
        employee3.setTitle("Data Scientist");

        // Employee 4
        Employee employee4 = new Employee();
        employee4.setEmployeeId(UUID.randomUUID().toString());
        employee4.setFirstName("Sarah");
        employee4.setLastName("Bron");
        employee4.setEmail("sarah.brow@example.com");
        employee4.setTitle("UX Designer");

        // Employee 5
        Employee employee5 = new Employee();
        employee5.setEmployeeId(UUID.randomUUID().toString());
        employee5.setFirstName("Michael");
        employee5.setLastName("Rockefeller");
        employee5.setEmail("michael.rockerfeller@example.com");
        employee5.setTitle("DevOps Engineer");

        // Employee 6
        Employee employee6 = new Employee();
        employee6.setEmployeeId(UUID.randomUUID().toString());
        employee6.setFirstName("Emily");
        employee6.setLastName("Willy");
        employee6.setEmail("emily.wilyy@example.com");
        employee6.setTitle("Marketing Specialist");

        // Employee 7
        Employee employee7 = new Employee();
        employee7.setEmployeeId(UUID.randomUUID().toString());
        employee7.setFirstName("David");
        employee7.setLastName("Miller");
        employee7.setEmail("david.miller@example.com");
        employee7.setTitle("Financial Analyst");

        // Employee 8
        Employee employee8 = new Employee();
        employee8.setEmployeeId(UUID.randomUUID().toString());
        employee8.setFirstName("Olivia");
        employee8.setLastName("Taylor");
        employee8.setEmail("olivia.taylor@example.com");
        employee8.setTitle("Accountant");

        // Employee 9
        Employee employee9 = new Employee();
        employee9.setEmployeeId(UUID.randomUUID().toString());
        employee9.setFirstName("Daniel");
        employee9.setLastName("Moore");
        employee9.setEmail("daniel.moore@example.com");
        employee9.setTitle("System Administrator");

        // Employee 10
        Employee employee10 = new Employee();
        employee10.setEmployeeId(UUID.randomUUID().toString());
        employee10.setFirstName("Sophia");
        employee10.setLastName("Clark");
        employee10.setEmail("sophia.clark@example.com");
        employee10.setTitle("HR Manager");

        // Employee 11
        Employee employee11 = new Employee();
        employee11.setEmployeeId(UUID.randomUUID().toString());
        employee11.setFirstName("William");
        employee11.setLastName("Hall");
        employee11.setEmail("william.hall@example.com");
        employee11.setTitle("Project Coordinator");

        // Employee 12
        Employee employee12 = new Employee();
        employee12.setEmployeeId(UUID.randomUUID().toString());
        employee12.setFirstName("Isabella");
        employee12.setLastName("Walker");
        employee12.setEmail("isabella.walker@example.com");
        employee12.setTitle("Legal Counsel");

        // Employee 13
        Employee employee13 = new Employee();
        employee13.setEmployeeId(UUID.randomUUID().toString());
        employee13.setFirstName("James");
        employee13.setLastName("Hernandez");
        employee13.setEmail("james.hernandez@example.com");
        employee13.setTitle("Customer Support Lead");

        // Employee 14
        Employee employee14 = new Employee();
        employee14.setEmployeeId(UUID.randomUUID().toString());
        employee14.setFirstName("Mia");
        employee14.setLastName("Lopez");
        employee14.setEmail("mia.lopez@example.com");
        employee14.setTitle("Graphic Designer");

        // Employee 15
        Employee employee15 = new Employee();
        employee15.setEmployeeId(UUID.randomUUID().toString());
        employee15.setFirstName("Alexander");
        employee15.setLastName("Perez");
        employee15.setEmail("alexander.perez@example.com");
        employee15.setTitle("Business Analyst");

        // Employee 16
        Employee employee16 = new Employee();
        employee16.setEmployeeId(UUID.randomUUID().toString());
        employee16.setFirstName("Charlotte");
        employee16.setLastName("Gonzalez");
        employee16.setEmail("charlotte.gonzalez@example.com");
        employee16.setTitle("Sales Representative");

        // Employee 17
        Employee employee17 = new Employee();
        employee17.setEmployeeId(UUID.randomUUID().toString());
        employee17.setFirstName("Benjamin");
        employee17.setLastName("Rodriguez");
        employee17.setEmail("benjamin.rodriguez@example.com");
        employee17.setTitle("Operations Manager");

        // Employee 18
        Employee employee18 = new Employee();
        employee18.setEmployeeId(UUID.randomUUID().toString());
        employee18.setFirstName("Amelia");
        employee18.setLastName("Martinez");
        employee18.setEmail("amelia.martinez@example.com");
        employee18.setTitle("Quality Assurance");

        // Employee 19
        Employee employee19 = new Employee();
        employee19.setEmployeeId(UUID.randomUUID().toString());
        employee19.setFirstName("Henry");
        employee19.setLastName("Garcia");
        employee19.setEmail("henry.garcia@example.com");
        employee19.setTitle("Network Engineer");

        // Employee 20
        Employee employee20 = new Employee();
        employee20.setEmployeeId(UUID.randomUUID().toString());
        employee20.setFirstName("Evelyn");
        employee20.setLastName("Hernandez");
        employee20.setEmail("evelyn.hernandez@example.com");
        employee20.setTitle("Account Executive");

        employeeList.addAll( List.of(
                employee1, employee2, employee3, employee4, employee5,
                employee6, employee7, employee8, employee9, employee10,
                employee11, employee12, employee13, employee14, employee15,
                employee16, employee17, employee18, employee19, employee20
        ));
    }

    public List<Employee> getEmployeeList() {
        addEmployees();
        return employeeList;
    }
}
