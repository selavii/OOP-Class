package org.example;

import java.util.Vector;

public class VectorStack<Element> {
    private Vector<Element> stackVector;

    public VectorStack() {
        stackVector = new Vector<>();
    }

    public void push(Element item) {
        stackVector.add(item);
    }

    public Element pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackVector.remove(stackVector.size() - 1);
    }

    public Element peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackVector.lastElement();
    }

    public boolean isEmpty() {
        return stackVector.isEmpty();
    }

    public int size() {
        return stackVector.size();
    }
}
