package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);




        // Testing ArrayStack with Integers and Strings
        System.out.println("------------------Populating the ArrayStack---------------");
        ArrayStack<Integer> arrayStackInt = new ArrayStack<>(10);
        ArrayStack<String> arrayStackStr = new ArrayStack<>(10);
        for (int i = 1; i <= 5; i++) {
            arrayStackInt.push(i);
            arrayStackStr.push("String" + i);
            System.out.println("Pushed to ArrayStack: " + i + ",String" + i);
        }
        System.out.println("----------------------ArrayStackTesting-----------------------");
        System.out.println("ArrayStack last integer is :" + " " + arrayStackInt.peek());
        System.out.println("ArrayStack Integer Pop: " + arrayStackInt.pop());
        System.out.println("ArrayStack last integer after pop is:" + " " + arrayStackInt.peek());
        System.out.println("ArrayStack Integer Pop: " + arrayStackInt.pop());
        System.out.println("ArrayStack last integer after pop is:" + " " + arrayStackInt.peek());
        System.out.println("ArrayStack last string is:" + " " + arrayStackStr.peek());
        System.out.println("ArrayStack String Pop: " + arrayStackStr.pop());
        System.out.println("ArrayStack last string after pop method is:" + " " + arrayStackStr.peek());



        // Testing LinkedListStack with Integers and Strings
        System.out.println("\n----------------Populating the LinkedListStack---------------");
        LinkedListStack<Integer> linkedListStackInt = new LinkedListStack<>();
        LinkedListStack<String> linkedListStackStr = new LinkedListStack<>();
        for (int i = 1; i <= 5; i++) {
            linkedListStackInt.push(i);
            linkedListStackStr.push("Str" + i);
            System.out.println("Pushed to LinkedListStack: " + i + ", Str" + i);
        }
        System.out.println("----------------------Testing the LinkedListStack-------------------------");
        System.out.println("The size of the LinkedListStack is: " + linkedListStackInt.size());
        System.out.println("Checking if the LinkedListStack is empty: " + linkedListStackInt.isEmpty());
        System.out.println("LinkedListStack last integer after pop is: " + linkedListStackInt.peek());
        System.out.println("LinkedListStack Integer Pop: " + linkedListStackInt.pop());
        System.out.println("LinkedListStack last integer after pop is: " + linkedListStackInt.peek());
        System.out.println("LinkedListStack last string is: " + linkedListStackStr.peek());
        System.out.println("LinkedListStack String Pop: " + linkedListStackStr.pop());
        System.out.println("LinkedListStack last string after pop method is: " + linkedListStackStr.peek());

        // Testing VectorStack with Integers and Strings
        VectorStack<Integer> vectorStackInt = new VectorStack<>();
        VectorStack<String> vectorStackStr = new VectorStack<>();

        System.out.println("---------------------Testing the VectorStack-------------------------");
        System.out.println("Checking if the Vector String Stack is empty: " + vectorStackInt.isEmpty());

        System.out.println("Choose an option:");
        System.out.println("1. Press one to see an exception");
        System.out.println("2. Press two to leave the exception and go further");

        int choice = scanner.nextInt();

        if (choice == 1) {
            // This block will try to peek and pop from an empty stack, leading to an exception
            System.out.println("Last element of the Int Vector Stack is: " + vectorStackInt.peek());
            System.out.println("VectorStack Int Pop: " + vectorStackInt.pop());
        } else if (choice == 2) {
            // Continue with further code or simply exit
            System.out.println("Skipping exception-generating code.");
        } else {
            System.out.println("Invalid choice. Exiting.");
        }

        scanner.close();
        System.out.println("--------------------Done with Stack implementations----------------");
//
        // Testing ArrayQueue with Integers and Strings
        System.out.println("\n----------------Populating ArrayQueue--------------------");
        ArrayQueue<Integer> arrayQueueInt = new ArrayQueue<>(10);
        ArrayQueue<String> arrayQueueStr = new ArrayQueue<>(10);
        for (int i = 1; i <= 5; i++) {
            arrayQueueInt.enqueue(i);
            arrayQueueStr.enqueue("Str" + i);
            System.out.println("Enqueued to ArrayQueue: " + i + ", Str" + i);
        }
        System.out.println("---------------------Testing ArrayQueue---------------------");
        System.out.println("The size of the Queue is:" + " " + arrayQueueInt.size());
        System.out.println("Checking if the Queue is empty:"+ " " + arrayQueueInt.isEmpty());
        System.out.println("Checking the first element of the queue:" + arrayQueueInt.peek());
        System.out.println("ArrayQueue Integer Dequeue: " + arrayQueueInt.dequeue());
        System.out.println("Checking the ArrayQueue first element after dequing:"+arrayQueueInt.peek());

//
        // Testing LinkedListQueue with Integers and Strings
        System.out.println("\n-----------------------Populating the LinkedListQueue--------------------------");
        LinkedListQueue<Integer> linkedListQueueInt = new LinkedListQueue<>();
        LinkedListQueue<String> linkedListQueueStr = new LinkedListQueue<>();
        for (int i = 1; i <= 5; i++) {
            linkedListQueueInt.enqueue(i);
            linkedListQueueStr.enqueue("Str" + i);
            System.out.println("Enqueued to LinkedListQueue: " + i + ", Str" + i);
        }
        System.out.println("-----------------Testing the LinkedListQueue-------------------");
        System.out.println("Checking the first element of the queue:"+ " " + linkedListQueueInt.peek());
        System.out.println("Checking the first element of the queue after dequing:" + " " + linkedListQueueInt.dequeue());
        System.out.println("Checking the first element of the queue:" + " "  + linkedListQueueInt.peek());



        // Testing CircularQueue with Integers and Strings
        System.out.println("\n-----------------------CircularQueue----------------------");
        CircularQueue<Integer> circularQueueInt = new CircularQueue<>(10);
        CircularQueue<String> circularQueueStr = new CircularQueue<>(10);

        System.out.println("-------------------------Testing the CircularQueue-----------------------------");
        System.out.println("Checking if the circular queue is empty: " + circularQueueInt.isEmpty());
        System.out.println("Checking the size of the circular queue: " + circularQueueStr.size());
    }
}
