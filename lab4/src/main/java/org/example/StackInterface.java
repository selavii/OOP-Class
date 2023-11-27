package org.example;

public interface StackInterface<Element> {
    void push(Element item);
    Element pop();
    Element peek();
    boolean isEmpty();
    int size();
}
