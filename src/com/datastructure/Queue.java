package com.datastructure;

import java.lang.reflect.*;
import java.util.*;

public class Queue<T> {

    private static final int SPECIAL_EMPTY_VALUE = -1;
    private static int MAX_SIZE = 40;
    private int size;
    private T[] elements;

    private int headIndex = SPECIAL_EMPTY_VALUE;
    private int tailIndex = SPECIAL_EMPTY_VALUE;

    public Queue(Class<T> clazz){
        this(clazz, MAX_SIZE);
    }

    public Queue(Class<T> clazz, int size){
        elements = (T[]) Array.newInstance(clazz, size);
    }

    //EnQueue

    public void enQueue(T data) throws QueueOverflowException{
        if(isFull()){
            throw new QueueOverflowException();
        }
        tailIndex = (tailIndex + 1) % elements.length;
        elements[tailIndex] = data;

        if(headIndex == SPECIAL_EMPTY_VALUE){
            headIndex = tailIndex;
        }
    }

    //Peek
    public T peek() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        }

        return elements[headIndex];
    }

    //DeQueue

    public T deQueue() throws QueueUnderflowException{
        if(isEmpty()){
            throw new QueueUnderflowException();
        }
        T data = elements[headIndex];

        if(headIndex == tailIndex){
            headIndex = SPECIAL_EMPTY_VALUE;
        }else{
            headIndex = (headIndex + 1) % elements.length;
        }
        return data;
    }

    public boolean offer(T data){
        if(isFull()){
            return false;
        }
        try {
            enQueue(data);
        } catch (QueueOverflowException e) {
            e.printStackTrace();
        }
        return true;
    }

    //isEmpty
    public boolean isEmpty(){
        return headIndex == SPECIAL_EMPTY_VALUE;
    }

    //isFull
    public boolean isFull(){
        int nextindex = (tailIndex + 1) % elements.length;
        return nextindex == headIndex;
    }

}
