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

    public void add(int index, Student student){
        if (!indexOfBound(index)){
            throw new IllegalArgumentException("index invalid!");
        }
        for (int i = totStudents -1; i >= index; i--) {
            students[i+1] = students[i];
        }
        students[index] = student;
        totStudents++;
    }

    public Student get(int index){
        //accept index and return student
        if (indexOfBound(index)){
            return students[index];
        }else {
            throw new IllegalArgumentException("invalid index!");
        }

    }

    private boolean indexOfBound(int index){
        return index >= 0 && index < totStudents;
    }

    public void remove(int index){
        //accept index and remove student in array
    }

    public boolean contains(Student student){
        //source if student contains in array (return true or false)
        for (int i = 0; i < totStudents; i++) {
            if (student.equals(students[i])){
                return true;
            }
        }
        return false;
    }

    public int length(){
        //return the array length
        return totStudents;
    }

    @Override
    public String toString() {
        return Arrays.toString(students);
    }
}
