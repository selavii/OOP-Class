package org.example;

public class Main {
    public static void main(String[] args) {
        // Testing ArrayStack with Integers and Strings
        System.out.println("Testing ArrayStack");
        ArrayStack<Integer> arrayStackInt = new ArrayStack<>(10);
        ArrayStack<String> arrayStackStr = new ArrayStack<>(10);
        for (int i = 1; i <= 5; i++) {
            arrayStackInt.push(i);
            arrayStackStr.push("Str" + i);
            System.out.println("Pushed to ArrayStack: " + i + ", Str" + i);
        }
        System.out.println("ArrayStack Integer Pop: " + arrayStackInt.pop());
        System.out.println("ArrayStack String Pop: " + arrayStackStr.pop());

        // Testing LinkedListStack with Integers and Strings
        System.out.println("\nTesting LinkedListStack");
        LinkedListStack<Integer> linkedListStackInt = new LinkedListStack<>();
        LinkedListStack<String> linkedListStackStr = new LinkedListStack<>();
        for (int i = 1; i <= 5; i++) {
            linkedListStackInt.push(i);
            linkedListStackStr.push("Str" + i);
            System.out.println("Pushed to LinkedListStack: " + i + ", Str" + i);
        }
        System.out.println("LinkedListStack Integer Pop: " + linkedListStackInt.pop());
        System.out.println("LinkedListStack String Pop: " + linkedListStackStr.pop());

        // Testing VectorStack with Integers and Strings
        System.out.println("\nTesting VectorStack");
        VectorStack<Integer> vectorStackInt = new VectorStack<>();
        VectorStack<String> vectorStackStr = new VectorStack<>();
        for (int i = 1; i <= 5; i++) {
            vectorStackInt.push(i);
            vectorStackStr.push("Str" + i);
            System.out.println("Pushed to VectorStack: " + i + ", Str" + i);
        }
        System.out.println("VectorStack Integer Pop: " + vectorStackInt.pop());
        System.out.println("VectorStack String Pop: " + vectorStackStr.pop());

        // Testing ArrayQueue with Integers and Strings
        System.out.println("\nTesting ArrayQueue");
        ArrayQueue<Integer> arrayQueueInt = new ArrayQueue<>(10);
        ArrayQueue<String> arrayQueueStr = new ArrayQueue<>(10);
        for (int i = 1; i <= 5; i++) {
            arrayQueueInt.enqueue(i);
            arrayQueueStr.enqueue("Str" + i);
            System.out.println("Enqueued to ArrayQueue: " + i + ", Str" + i);
        }
        System.out.println("ArrayQueue Integer Dequeue: " + arrayQueueInt.dequeue());
        System.out.println("ArrayQueue String Dequeue: " + arrayQueueStr.dequeue());

        // Testing LinkedListQueue with Integers and Strings
        System.out.println("\nTesting LinkedListQueue");
        LinkedListQueue<Integer> linkedListQueueInt = new LinkedListQueue<>();
        LinkedListQueue<String> linkedListQueueStr = new LinkedListQueue<>();
        for (int i = 1; i <= 5; i++) {
            linkedListQueueInt.enqueue(i);
            linkedListQueueStr.enqueue("Str" + i);
            System.out.println("Enqueued to LinkedListQueue: " + i + ", Str" + i);
        }
        System.out.println("LinkedListQueue Integer Dequeue: " + linkedListQueueInt.dequeue());
        System.out.println("LinkedListQueue String Dequeue: " + linkedListQueueStr.dequeue());

        // Testing CircularQueue with Integers and Strings
        System.out.println("\nTesting CircularQueue");
        CircularQueue<Integer> circularQueueInt = new CircularQueue<>(10);
        CircularQueue<String> circularQueueStr = new CircularQueue<>(10);
        for (int i = 1; i <= 5; i++) {
            circularQueueInt.enqueue(i);
            circularQueueStr.enqueue("Str" + i);
            System.out.println("Enqueued to CircularQueue: " + i + ", Str" + i);
        }
        System.out.println("CircularQueue Integer Dequeue: " + circularQueueInt.dequeue());
        System.out.println("CircularQueue String Dequeue: " + circularQueueStr.dequeue());
    }
}
