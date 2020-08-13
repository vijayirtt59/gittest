package com.datastructure;

public class StackTest {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();

        System.out.println("Stack is empty: " + stack.isEmpty());

        try {
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
            stack.push(50);
        } catch (StackOverflowException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(stack.peek());
        } catch (StackUnderflowException e) {
            e.printStackTrace();
        }

        System.out.println("Stack is empty: " + stack.isEmpty());
        System.out.println("Stack is Full: " + stack.isFull());
        System.out.println("Stack Size: " + stack.getSize());

        try {
            stack.pop();
        } catch (StackUnderflowException e) {
            e.printStackTrace();
        }

        try {
            stack.peek();
        } catch (StackUnderflowException e) {
            e.printStackTrace();
        }

        System.out.println("Stack Size: " + stack.getSize());
    }
}
