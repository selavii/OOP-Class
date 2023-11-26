package org.example;

public class ArrayQueue<Element> {
    private Element[] queueArray;
    private int frontIndex, rearIndex, currentSize, queueCapacity;

    public ArrayQueue(int capacity) {
        queueArray = (Element[]) new Object[capacity];
        this.queueCapacity = capacity;
        frontIndex = currentSize = 0;
        rearIndex = capacity - 1;
    }

    public void enqueue(Element item) {
        if (currentSize == queueCapacity) throw new IllegalStateException("Queue is full");
        rearIndex = (rearIndex + 1) % queueCapacity;
        queueArray[rearIndex] = item;
        currentSize++;
    }

    public Element dequeue() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        Element item = queueArray[frontIndex];
        frontIndex = (frontIndex + 1) % queueCapacity;
        currentSize--;
        return item;
    }

    public Element peek() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        return queueArray[frontIndex];
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public int size() {
        return currentSize;
    }
}
