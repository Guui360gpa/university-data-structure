package com.university.linkedlist;

public class Cell {

    private Cell next;
    private Object element;

    public Cell(Object element,Cell next) {
        this.next = next;
        this.element = element;
    }

    public Cell getNext() {
        return next;
    }

    public void setNext(Cell next) {
        this.next = next;
    }

    public Object getElement() {
        return element;
    }
}
