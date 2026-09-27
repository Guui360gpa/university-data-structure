package com.university;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        Student s1 = new Student("João");
        Student s2 = new Student("Jose");

        Array list = new Array();

        list.add(s1);
        list.add(s2);

        System.out.println(list);
    }
}
