package com.higgsup.intern.spring.pojo.student;

public class SubjectImpl implements Subject {
    public void registerOptionalSubject() {
        System.out.println("Optional Subject...");
    }

    public void registerObligatorySubject() {
        System.out.println("Obligatory Subject...");
    }
}
