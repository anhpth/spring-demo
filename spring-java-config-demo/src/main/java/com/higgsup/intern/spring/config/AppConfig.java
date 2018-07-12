package com.higgsup.intern.spring.config;


import com.higgsup.intern.spring.pojo.student.Student;
import com.higgsup.intern.spring.pojo.student.Subject;
import com.higgsup.intern.spring.pojo.student.SubjectImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Autowired
    private Subject subject;

    @Bean
    public SubjectImpl subject() { return new SubjectImpl();};

    @Bean
    public Student student() { return new Student(subject);};
}
