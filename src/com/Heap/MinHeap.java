package com.Heap;

public class MinHeap<T extends Comparable> extends Heap<T> {

    public MinHeap(Class<T> clazz){
        super(clazz);
    }

    public MinHeap(Class<T> clazz, int size){
        super(clazz, size);
    }

    protected void siftDown(int index){
        int leftIndex = getLeftChildIndex(index);
        int rightIndex = getRightChildIndex(index);
        int smallerIndex = -1;

        if(leftIndex !=-1 && rightIndex!=-1){
            smallerIndex = getElementAtIndex(leftIndex).compareTo(getElementAtIndex(rightIndex)) < 0?leftIndex:rightIndex;
        }else if(leftIndex != -1){
            smallerIndex = leftIndex;
        }else if(rightIndex !=-1){
            smallerIndex = rightIndex;
        }

        if(smallerIndex == -1){
            return;
        }

        if(getElementAtIndex(smallerIndex).compareTo(getElementAtIndex(index)) > 0){
            swap(smallerIndex, index);
            siftDown(smallerIndex);
        }
    }

    protected void siftUp(int index){
        int parentIndex = getParentIndex(index);
        if(parentIndex !=-1 && getElementAtIndex(parentIndex).compareTo(getElementAtIndex(index))<0){
            swap(parentIndex, index);
            siftUp(parentIndex);
        }
    }

}
