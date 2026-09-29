package com.university.stack;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push("Mauricio");
        System.out.println(stack);
        stack.push("Guilherme");
        System.out.println(stack);

        String name = stack.peek();
        System.out.println(name);

        String r1 = stack.pop();
        System.out.println(r1);
        String r2 = stack.pop();
        System.out.println(r2);
        System.out.println(stack);

        System.out.println(stack.isEmpty());


    }
}
