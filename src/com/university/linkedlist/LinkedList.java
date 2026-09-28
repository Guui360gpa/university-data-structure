package com.university.linkedlist;

public class LinkedList {

    private Cell first = null;
    private Cell last = null;
    private int totElements = 0;

    public void addToBeginning(Object element){
        Cell cell = new Cell(element,first);
        this.first = cell;

        if (this.totElements == 0){
            this.last = this.first;
        }

        this.totElements++;
    }

    public void add(Object element){
        if (this.totElements == 0) {
            addToBeginning(element);
        }else {
            Cell cell = new Cell(element,null);
            this.last.setNext(cell);
            this.last = cell;
            this.totElements++;
        }
    }

    public void add(int index, Object element){

    }

    public Object get(int index){
        return null;
    }

    public void remove(int index){

    }

    public int length(){
        return 0;
    }

    public boolean contains(Object o){
        return false;
    }

    @Override
    public String toString() {
        if (this.totElements == 0) {
            return "[]";
        }
        Cell current = first;
        StringBuilder builder = new StringBuilder("[");

        for (int i = 0; i < totElements; i++) {
            builder.append(current.getElement());
            builder.append(",");

            current = current.getNext();
        }

        builder.append("]");

        return builder.toString();
    }
}
