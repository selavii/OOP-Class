package com.labtwo.models;
import java.util.ArrayList;
import java.util.List;
public class University {
    private List<Faculty> faculties = new ArrayList<>();

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public List<Faculty> getFaculties() {
        return new ArrayList<>(faculties);
    }

    public Faculty getFacultyByStudentId(String studentId) {
        for (Faculty faculty : faculties) {
            for (Student student : faculty.getStudents()) {
                if (student.getStudentId().equals(studentId)) return faculty;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder("University consists of the following faculties:\n");
        for (Faculty faculty : faculties) {
            text.append(faculty.getName()).append(" (").append(faculty.getAbbreviation()).append(")\n");
        }
        return text.toString();
    }
}
