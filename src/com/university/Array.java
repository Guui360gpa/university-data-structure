package com.university;

import java.util.Arrays;

public class Array {
    private Student[] students = new Student[100];
    private int totStudents = 0;

    public void add(Student student){
        //accepts students
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null){
                students[i] = student;
                totStudents++;
                break;
            }
        }
    }

    public Student get(int index){
        //accept index and return student
        return null;
    }

    public void remove(int index){
        //accept index and remove student in array
    }

    public boolean contains(Student student){
        //source if student contains in array (return true or false)
        return false;
    }

    public int length(){
        //return the array length
        return 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(students);
    }
}
