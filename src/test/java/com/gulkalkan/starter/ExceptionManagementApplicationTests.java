package com.gulkalkan.starter;

import com.gulkalkan.dto.DtoEmployee;
import com.gulkalkan.service.IEmployeeService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = {ExceptionManagementStarter.class})
class ExceptionManagementApplicationTests {

    @Autowired
    private IEmployeeService employeeService;

@BeforeEach
    public void beforeEach(){
        System.out.println("Test öncesi çalışır.");
    }
    @Test
    public void  testFindEmployeeById() {
        DtoEmployee employee = employeeService.findEmployeeById(1L);
    }
    @AfterEach
    public void afterEach(){
        System.out.println("Test sonrası çalışır.");
    }


   //  if (employee != null) {
     //    System.out.println("İSim : " + employee.getName());
     //}


    }

