package com.university.queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.add("Mauricio");
        queue.add("Guilherme");
        System.out.println(queue);

        String x1 = queue.poll();
        System.out.println(x1);
        System.out.println(queue);
    }
}
