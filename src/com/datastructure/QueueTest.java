package com.datastructure;

public class QueueTest {

    public static void main(String[] args) throws QueueUnderflowException, QueueOverflowException{
        Queue queue = new Queue(Integer.class, 4);

        System.out.println("Queue full?: " + queue.isFull());
        System.out.println("Queue empty?: " + queue.isEmpty());

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);

        System.out.println("Queue full?: " + queue.isFull());
        System.out.println("Queue empty?: " + queue.isEmpty());

        queue.enQueue(4);
        System.out.println("Queue full?: " + queue.isFull());
        System.out.println("Queue empty?: " + queue.isEmpty());

        System.out.println("Queue peek: " + queue.peek());

        Integer data = (int)queue.deQueue();
        System.out.println("Dequeued element: " + data);

        System.out.println("Peek : " + queue.peek());

        data = (int)queue.deQueue();
        System.out.println("Dequeued element: " + data);
        System.out.println("Peek : " + queue.peek());

        try {
            queue.enQueue(4);
            queue.enQueue(5);
            queue.enQueue(6);
        } catch (QueueOverflowException soe) {
            System.out.println("Queue is full! No room available.");
        }

        try {
            queue.deQueue();
            queue.deQueue();
            queue.deQueue();
            queue.deQueue();
            queue.deQueue();
            queue.deQueue();
        } catch (QueueUnderflowException sue) {
            System.out.println("Queue is empty! No elements available.");
        }
    }
}
