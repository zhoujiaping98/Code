package com.demo.learning_demo;

import com.demo.learning_demo.Service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LearningDemoApplicationTests {

    @Autowired
    EmployeeService employeeService;

    @Test
    void contextLoads() {
        employeeService.Test();
    }

}
