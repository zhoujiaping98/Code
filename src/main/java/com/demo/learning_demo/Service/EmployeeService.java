package com.demo.learning_demo.Service;

import com.demo.learning_demo.Entity.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {




    public void Test(){
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("111");

        for(int i = 0;i < 10;i ++){
            if(i == 9){
                employee = null;
            }

            System.out.println(employee.getId());
        }
    }
}
