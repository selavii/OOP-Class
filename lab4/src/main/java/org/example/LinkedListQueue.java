package org.example;

public class LinkedListQueue<Element> {
    private static class QueueNode<Element> {
        Element data;
        QueueNode<Element> next;

        QueueNode(Element data) {
            this.data = data;
        }
    }

    private QueueNode<Element> frontNode, rearNode;

    public void enqueue(Element item) {
        QueueNode<Element> newNode = new QueueNode<>(item);
        if (isEmpty()) {
            frontNode = rearNode = newNode;
        } else {
            rearNode.next = newNode;
            rearNode = newNode;
        }
    }

    public Element dequeue() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        Element item = frontNode.data;
        frontNode = frontNode.next;
        if (frontNode == null) rearNode = null;
        return item;
    }

    public Element peek() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        return frontNode.data;
    }

    public boolean isEmpty() {
        return frontNode == null;
    }

    public int size() {
        int nodeCount = 0;
        QueueNode<Element> currentNode = frontNode;
        while (currentNode != null) {
            nodeCount++;
            currentNode = currentNode.next;
        }
        return nodeCount;
    }
}
