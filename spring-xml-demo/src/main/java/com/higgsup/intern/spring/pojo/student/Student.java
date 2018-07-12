package com.higgsup.intern.spring.pojo.student;

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

    public void registerOptionalSubject(){
        subject.registerOptionalSubject();
    }

    public void registerObligatorySubject(){
        subject.registerObligatorySubject();
    }
}