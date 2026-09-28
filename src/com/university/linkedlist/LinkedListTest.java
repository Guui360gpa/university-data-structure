package com.university.linkedlist;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        System.out.println(list);
        list.addToBeginning("mauricio");
        System.out.println(list);
        list.addToBeginning("paulo");
        System.out.println(list);
        list.addToBeginning("guilherme");
        System.out.println(list);

        list.add("marcelo");
        System.out.println(list);

        list.add(2,"gabriel");
        System.out.println(list);

        Object x = list.get(2);
        System.out.println(x);

        System.out.println("Length: " + list.length());

        list.removeToBeginning();
        System.out.println(list);
    }
}
