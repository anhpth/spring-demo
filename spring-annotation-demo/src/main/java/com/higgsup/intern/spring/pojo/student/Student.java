package com.higgsup.intern.spring.pojo.student;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private Subject subject;

    public Student(Subject subject) {
        this.subject = subject;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    
    public void registerObligatorySubject(){
        subject.registerObligatorySubject();
    }
}