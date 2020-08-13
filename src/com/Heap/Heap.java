package com.Heap;

import java.lang.reflect.*;

public abstract class Heap<T extends Comparable> {

    private static int MAX_SIZE = 40;
    private int count = 0;
    private T[] array;

    public Heap(Class<T> clazz){
        this(clazz, MAX_SIZE);
    }

    public Heap(Class<T> clazz, int size){
        array = (T[])Array.newInstance(clazz, size);
    }

    public int getLeftChildIndex(int index){
        int leftChildIndex = 2*index + 1;
        if(leftChildIndex >= count){
            return -1;
        }
        return leftChildIndex;
    }

    public int getRightChildIndex(int index){
        int rightChildIndex = 2*index+2;
        if(rightChildIndex>=count){
            return -1;
        }
        return rightChildIndex;
    }

    public int getParentIndex(int index){
        if(index<0 && index>count){
            return -1;
        }
        return (index - 1)/2;
    }

    public void swap(int index1, int incex2){
        T temp = array[index1];
        array[incex2] = array[index1];
        array[index1] = temp;
    }

    public int getSize(){
        return count;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public boolean isFull(){
        return count==array.length;
    }

    public T getElementAtIndex(int index){
        return array[index];
    }

    public T getHighPriority() throws HeapEmptyException{
        if(count == 0){
            throw new HeapEmptyException();
        }
        return array[0];
    }

    protected abstract void siftUp(int index);
    protected abstract void siftDown(int index);
    public void insert(T element) throws HeapFullException{
        if(array.length >= count){
            throw new HeapFullException();
        }

        array[count] = element;
        siftUp(count);
        count++;
    }

    public T removeHighestPriority() throws HeapEmptyException{
        if(isEmpty()){
            throw new HeapEmptyException();
        }
        T min = getHighPriority();
        array[0] = array[count -1];
        count--;
        siftDown(0);

        return min;
    }
}
