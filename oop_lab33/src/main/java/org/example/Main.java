package org.example;
import org.example.FileMonitor;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        FileMonitor monitor = new FileMonitor("/path/to/folder");  // Replace with your folder path
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
