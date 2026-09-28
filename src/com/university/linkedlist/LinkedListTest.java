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
    }
}
