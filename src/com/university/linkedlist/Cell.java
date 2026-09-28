package com.university.linkedlist;

public class Cell {

    private Cell next;
    private Cell previous;
    private Object element;

    public Cell(Object element,Cell next) {
        this.next = next;
        this.element = element;
    }

    public Cell(Object element) {
        this(element,null);
    }

    public Cell getNext() {
        return next;
    }

    public void setNext(Cell next) {
        this.next = next;
    }

    public Cell getPrevious() {
        return previous;
    }

    public void setPrevious(Cell previous) {
        this.previous = previous;
    }

    public Object getElement() {
        return element;
    }
}
