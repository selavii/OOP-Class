package com.labtwo.models;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private String abbreviation;
    private List<StudyField> studyFields;
    private List<Student> students;

    public Faculty(String name, String abbreviation, StudyField studyField) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.studyFields = new ArrayList<>();
        this.students = new ArrayList<>();
        this.studyFields.add(studyField); // Add the selected study field to the faculty
    }

    public enum StudyField {
        MECHANICAL_ENGINEERING, SOFTWARE_ENGINEERING, FOOD_TECHNOLOGY, URBANISM_ARCHITECTURE, VETERINARY_MEDICINE
    }

    public boolean hasStudent(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public List<Student> getGraduates() {
        List<Student> graduates = new ArrayList<>();
        for (Student student : students) {
            if (student.hasGraduated()) graduates.add(student);
        }
        return graduates;
    }

    public boolean doesStudentBelong(Student student) {
        return students.contains(student);
    }
}
