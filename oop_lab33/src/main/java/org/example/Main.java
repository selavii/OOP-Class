package org.example;


import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        FileMonitor monitor = new FileMonitor("C:\\Users\\Daniel\\Documents\\GitHub\\OOP-Class\\oop_lab33\\src\\main\\java\\org\\example");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter command: ");
            if (!monitor.processCommand(scanner.nextLine())) {
                scanner.close();
                break;
            }
        }
    }
}
