package com.example.restapi;

import com.example.restapi.configuration.MyConfig;
import com.example.restapi.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

//
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);
//
//        Employee empById = communication.getEmployee(2);
//        System.out.println(empById);
//
//        Employee employee = new Employee("Sveta", "Sok", "hr", 1884);
//        employee.setId(19);
//        communication.saveEmployee(employee);

//        communication.deleteEmployee(18);
    }
}
