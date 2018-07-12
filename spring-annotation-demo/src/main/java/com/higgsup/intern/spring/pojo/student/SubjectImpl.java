package com.higgsup.intern.spring.pojo.student;

import org.springframework.stereotype.Component;

@Component
public class SubjectImpl implements Subject {
    public void registerObligatorySubject() {
        System.out.println("Obligatory Subject...");
    }
}
