package com.university.stack;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.insert("Mauricio");
        System.out.println(stack);
        stack.insert("Guilherme");
        System.out.println(stack);

        String r1 = stack.remove();
        System.out.println(r1);
        String r2 = stack.remove();
        System.out.println(r2);
        System.out.println(stack);
    }
}
