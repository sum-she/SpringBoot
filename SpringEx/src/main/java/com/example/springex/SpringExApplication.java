package com.example.springex;

import Model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SpringExApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =  SpringApplication.run(SpringExApplication.class, args);
        Employee emp = context.getBean(Employee.class);
        emp.setName("Yo");
        emp.setId(100);
        emp.details();

//        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigStudent.class);
//        Student student = ctx.getBean("st", Student.class);
//        student.call();
    }
}
