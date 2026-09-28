package com.university.linkedlist;

public class LinkedList {

    private Cell first = null;
    private Cell last = null;
    private int totElements = 0;

    public void addToBeginning(Object element){
        if (this.totElements == 0){
            Cell newCell = new Cell(element);
            this.first = newCell;
            this.last = newCell;
        } else {
            Cell newCell = new Cell(element,this.first);
            this.first.setPrevious(newCell);
            this.first = newCell;
        }
        totElements++;
    }

    public void add(Object element){
        if (this.totElements == 0) {
            addToBeginning(element);
        }else {
            Cell newCell = new Cell(element);
            this.last.setNext(newCell);
            newCell.setPrevious(this.last);
            this.last = newCell;
            this.totElements++;
        }
    }

    public void add(int index, Object element){
        if (index == 0){
            addToBeginning(element);
        } else if (index == this.totElements) {
            add(element);
        }else {
            Cell previous = this.getCell(index - 1);
            Cell cell = new Cell(element,previous.getNext());
            previous.setNext(cell);
            this.totElements++;
        }
    }

    private boolean indexBusy(int index){
        return index >= 0 && index < this.totElements;
    }

    private Cell getCell(int index){
        if (!indexBusy(index)){
            throw new IllegalArgumentException("index does not exist");
        }

        Cell current = first;

        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    public Object get(int index){
        return getCell(index).getElement();
    }

    public void removeToBeginning(){
        if (this.totElements == 0){
            throw new IllegalArgumentException("empty list");
        }
        this.first = this.first.getNext();
        this.totElements--;
        if (totElements == 0){
            this.last = null;
        }
    }

    public void remove(int index){

    }

    public int length(){
        return this.totElements;
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
