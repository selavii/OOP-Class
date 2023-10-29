package org.example;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        FileMonitor monitor = new FileMonitor("C:/Users/Daniel/Documents/GitHub/OOP-Class/oop_lab33/src/main/java/org/example");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();  // Display the menu options
            System.out.print("Enter command: ");
            if (!monitor.processCommand(scanner.nextLine())) {
                scanner.close();
                break;
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n-------------------");
        System.out.println("File Monitor Menu:");
        System.out.println("-------------------");
        System.out.println("1. commit - Update snapshot time");
        System.out.println("2. info [filename] - Get info about a specific file");
        System.out.println("3. status - Check status of all files in directory");
        System.out.println("4. exit - Exit the File Monitor system");
        System.out.println("-------------------\n");
    }
}
