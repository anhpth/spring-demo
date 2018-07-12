package com.higgsup.intern.spring.config;

import com.higgsup.intern.spring.pojo.student.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringJavaConfig {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = (Student) applicationContext.getBean(Student.class);
        student.registerObligatorySubject();
    }
}
