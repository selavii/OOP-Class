package org.example;

public class ArrayStack<Element> {
    private Element[] stackArray;
    private int topIndex;
    private int stackCapacity;

    public ArrayStack(int capacity) {
        stackArray = (Element[]) new Object[capacity];
        this.stackCapacity = capacity;
        topIndex = -1;
    }

    public void push(Element item) {
        if (topIndex == stackCapacity - 1) {
            throw new IllegalStateException("Stack is full");
        }
        stackArray[++topIndex] = item;
    }

    public Element pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackArray[topIndex--];
    }

    public Element peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackArray[topIndex];
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

    public int size() {
        return topIndex + 1;
    }
}
