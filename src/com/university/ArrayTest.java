package com.university;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        Student s1 = new Student("João");
        Student s2 = new Student("Jose");
        Student s3 = new Student("Danilo");

        Array list = new Array();

        list.add(s1);
        list.add(s2);

        System.out.println(list);
        System.out.println("Size: " + list.length());
        System.out.println("The list contains " + s1.getName() + "? " + list.contains(s1));
        System.out.println("The list contains " + s3.getName() + "? " + list.contains(s3));
        System.out.println("Student 1: " + list.get(0));
        System.out.println("Student 2: " + list.get(1));
        System.out.println("Student 3: " + list.get(2));
    }
}
