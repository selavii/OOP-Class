package com.labtwo.models.behaviour;

import java.util.Date;
import java.util.Scanner;
import com.labtwo.models.University;
import com.labtwo.models.Student;
import com.labtwo.models.Faculty;
import java.util.List;
import java.util.ArrayList;

public class LoopApp {
    private University university;
    private Scanner scanner;

    public LoopApp() {
        this.university = new University();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            displayMenu();

            int choice = getChoice();

            if (choice == 6) {
                System.out.println("Exiting...");
                closeScanner();
                System.exit(0);
            }

            executeChoice(choice);
        }
    }

    private void displayMenu() {
        System.out.println("1: Display University faculties");
        System.out.println("2: Create a new Faculty");
        System.out.println("3: Add a Student to a Faculty");
        System.out.println("4: Check Students Graduated from a Faculty");
        System.out.println("5: Check Student's Faculty by ID");
        System.out.println("6: Exit");
    }

    private int getChoice() {
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume the leftover newline
        return choice;
    }

    private void executeChoice(int choice) {
        switch (choice) {
            case 1:
                displayUniversityFaculties();
                break;
            case 2:
                createNewFaculty();
                break;
            case 3:
                addStudentToFaculty();
                break;
            case 4:
                checkStudentsGraduatedFromFaculty();
                break;
            case 5:
                checkStudentFacultyByID();
                break;
            case 6:
                System.out.println("Exiting...");
                closeScanner();
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice! Please choose again.");
        }
    }

    public void displayUniversityFaculties() {
        System.out.println(university);
    }

    public void createNewFaculty() {
        System.out.println("Enter Faculty Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Faculty Abbreviation:");
        String abbreviation = scanner.nextLine();

        // Display available study fields and let the user choose one
        System.out.println("Choose a Study Field:");
        for (int i = 0; i < Faculty.StudyField.values().length; i++) {
            System.out.println(i + 1 + ": " + Faculty.StudyField.values()[i]);
        }
        int studyFieldChoice = getChoice();

        // Check if the user's choice is valid
        if (studyFieldChoice >= 1 && studyFieldChoice <= Faculty.StudyField.values().length) {
            // Subtract 1 to get the correct index in the enum values array
            Faculty.StudyField selectedStudyField = Faculty.StudyField.values()[studyFieldChoice - 1];

            // Create the faculty with the selected study field
            university.addFaculty(new Faculty(name, abbreviation, selectedStudyField));
            System.out.println("Faculty " + name + " has been added to the university with Study Field: " + selectedStudyField);
        } else {
            System.out.println("Invalid study field choice. Faculty not created.");
        }
    }

    public void addStudentToFaculty() {
        System.out.println("Enter Student ID:");
        String studentId = scanner.nextLine();
        System.out.println("Enter Student First Name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter Student Last Name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter Student Email:");
        String email = scanner.nextLine();

        // Ask if the student has graduated
        System.out.println("Has the student graduated? (yes/no):");
        String graduationStatus = scanner.nextLine();
        boolean hasGraduated = graduationStatus.equalsIgnoreCase("yes");

        Student student = new Student(studentId, firstName, lastName, email, new Date(), new Date());
        student.setHasGraduated(hasGraduated); // Set graduation status

        System.out.println("Enter Faculty Name to which the student should be added:");
        String facultyName = scanner.nextLine();

        boolean facultyFound = false;
        for (Faculty faculty : university.getFaculties()) {
            if (faculty.getName().equalsIgnoreCase(facultyName)) {
                faculty.addStudent(student);
                System.out.println("Student added to the Faculty!");
                facultyFound = true;
                break;
            }
        }

        if (!facultyFound)
            System.out.println("Faculty not found!");
    }

    public void checkStudentsGraduatedFromFaculty() {
        System.out.println("Enter Faculty Name:");
        String facultyName = scanner.nextLine();

        boolean facultyFound = false;
        for (Faculty faculty : university.getFaculties()) {
            if (faculty.getName().equalsIgnoreCase(facultyName)) {
                List<Student> graduatedStudents = new ArrayList<>();

                for (Student student : faculty.getStudents()) {
                    if (student.hasGraduated()) {
                        graduatedStudents.add(student);
                    }
                }

                if (!graduatedStudents.isEmpty()) {
                    System.out.println("Students who have graduated from " + faculty.getName() + ":");
                    for (Student graduatedStudent : graduatedStudents) {
                        System.out.println("Student ID: " + graduatedStudent.getStudentId());
                        System.out.println("First Name: " + graduatedStudent.getFirstName());
                        System.out.println("Last Name: " + graduatedStudent.getLastName());
                        System.out.println("Email: " + graduatedStudent.getEmail());
                        System.out.println("Graduated: Yes");
                        System.out.println("------------------------");
                    }
                } else {
                    System.out.println("No students have graduated from " + faculty.getName() + " yet.");
                }

                facultyFound = true;
                break;
            }
        }

        if (!facultyFound)
            System.out.println("Faculty not found!");
    }

    public void checkStudentFacultyByID() {
        System.out.println("Enter Student ID:");
        String studentId = scanner.nextLine();
        boolean studentFound = false;

        for (Faculty faculty : university.getFaculties()) {
            if (faculty.hasStudent(studentId)) {
                System.out.println("The student with ID: " + studentId + " belongs to the faculty: " + faculty.getName());
                studentFound = true;
                break;
            }
        }

        if (!studentFound)
            System.out.println("No student with ID: " + studentId + " was found in any faculty.");
    }

    public void closeScanner() {
        scanner.close();
    }
}
