package com.university.stack;

import java.util.LinkedList;
import java.util.List;

public class Stack {
    private List<String> names = new LinkedList<String>();

    public void insert(String name){
        names.add(name);
    }

    public String remove() {
        return "";
    }

    public boolean isEmpty(){
        return false;
    }

    @Override
    public String toString() {
        return names.toString();
    }
}
