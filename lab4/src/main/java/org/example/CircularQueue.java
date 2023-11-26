package org.example;

public class CircularQueue<Element> {
    private Element[] circularArray;
    private int frontIndex, rearIndex, currentSize, queueCapacity;

    public CircularQueue(int capacity) {
        circularArray = (Element[]) new Object[capacity];
        this.queueCapacity = capacity;
        frontIndex = currentSize = 0;
        rearIndex = capacity - 1;
    }

    public void enqueue(Element item) {
        if (currentSize == queueCapacity) throw new IllegalStateException("Queue is full");
        rearIndex = (rearIndex + 1) % queueCapacity;
        circularArray[rearIndex] = item;
        currentSize++;
    }

    public Element dequeue() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        Element item = circularArray[frontIndex];
        frontIndex = (frontIndex + 1) % queueCapacity;
        currentSize--;
        return item;
    }

    public Element peek() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        return circularArray[frontIndex];
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public int size() {
        return currentSize;
    }
}
