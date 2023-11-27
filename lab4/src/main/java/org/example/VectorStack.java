package org.example;

import java.util.Vector;

public class VectorStack<Element> implements StackInterface<Element> {
    private Vector<Element> stackVector;

    public VectorStack() {
        stackVector = new Vector<>();
    }

    @Override
    public void push(Element item) {
        stackVector.add(item);
    }

    @Override
    public Element pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackVector.remove(stackVector.size() - 1);
    }

    @Override
    public Element peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackVector.lastElement();
    }

    @Override
    public boolean isEmpty() {
        return stackVector.isEmpty();
    }

    @Override
    public int size() {
        return stackVector.size();
    }
}
