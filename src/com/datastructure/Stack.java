package com.datastructure;

public class Stack<T> {

    private int MAX_SIZE = 40;
    private int size = 0;
    private Element<T> top;

    public Stack(){}
    public void push(T data) throws StackOverflowException{

        if(size == MAX_SIZE){
            throw new StackOverflowException();
        }

        Element<T> elem = new Element<>(data, top);
        top = elem;
        size++;
    }

    public T pop() throws StackUnderflowException{

        if(size == 0){
            throw new StackUnderflowException();
        }

        Element<T> elem = top;
        top = top.getNext();
        size--;
        return elem.getData();

    }

    public T peek() throws StackUnderflowException{
        if(size == 0){
            throw new StackUnderflowException();
        }
        return top.getData();
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size==MAX_SIZE;
    }

    public int getSize(){
        return size;
    }
}
