package com.university.queue;

import java.util.LinkedList;
import java.util.List;

public class Queue {

    List<String> students = new LinkedList<String>();

    public void add(String student){
        students.add(student);
    }

    public String poll(){
        return students.removeFirst();
    }

    public boolean isEmpty() {
        return students.isEmpty();
    }

    @Override
    public String toString() {
        return students.toString();
    }
}
