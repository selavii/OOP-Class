package com.labtwo.models;

import java.util.Date;

public class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    private String email;
    private Date enrollmentDate;
    private Date dateOfBirth;
    private boolean hasGraduated;

    // Constructor
    public Student(String studentId, String firstName, String lastName, String email, Date enrollmentDate, Date dateOfBirth) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.enrollmentDate = enrollmentDate;
        this.dateOfBirth = dateOfBirth;
        this.hasGraduated = false;
    }


    public String getStudentId() {
        return studentId;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public Date getEnrollmentDate() {
        return enrollmentDate;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public boolean hasGraduated() {
        return hasGraduated;
    }


    public void setHasGraduated(boolean hasGraduated) {
        this.hasGraduated = hasGraduated;
    }

    @Override
    public String toString() {
        return this.lastName + " " + this.firstName + " " + this.email;
    }
}

