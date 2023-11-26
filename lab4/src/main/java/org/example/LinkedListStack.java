package org.example;

public class LinkedListStack<Element> {
    private static class StackNode<Element> {
        Element data;
        StackNode<Element> next;

        StackNode(Element data) {
            this.data = data;
        }
    }

    private StackNode<Element> topNode;

    public void push(Element item) {
        StackNode<Element> newNode = new StackNode<>(item);
        newNode.next = topNode;
        topNode = newNode;
    }

    public Element pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        Element item = topNode.data;
        topNode = topNode.next;
        return item;
    }

    public Element peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return topNode.data;
    }

    public boolean isEmpty() {
        return topNode == null;
    }

    public int size() {
        int nodeCount = 0;
        StackNode<Element> currentNode = topNode;
        while (currentNode != null) {
            nodeCount++;
            currentNode = currentNode.next;
        }
        return nodeCount;
    }
}
