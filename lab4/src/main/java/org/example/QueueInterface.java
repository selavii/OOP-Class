package org.example;

public interface QueueInterface<Element> {
    void enqueue(Element item);
    Element dequeue();
    Element peek();
    boolean isEmpty();
    int size();
}
