package com.Heap;

public class HeapSort {

    private static int[] array = {4, 6, 9, 2, 10, 56, 12, 5, 1, 17, 14};

    public int getLeftChildIndex(int index, int endIndex){
        int leftChildIndex = 2*index + 1;
        if(leftChildIndex > endIndex){
            return -1;
        }
        return leftChildIndex;
    }

    public int getRightChildIndex(int index, int endIndex){
        int rightChildIndex = 2* index + 2;
        if(rightChildIndex > endIndex){
            return  -1;
        }
        return rightChildIndex;
    }

    public int getParentIndex(int index, int endIndex){
        //int parentIndex = (index -1 )/2;
        if(index < 0 || index > endIndex){
            return -1;
        }
        return (index - 1)/2;
    }

    public void swap(int index1, int index2){
        int tempIndex = array[index1];
        array[index1] = array[index2];
        array[index2] = tempIndex;
    }

    public void percolateDown(int index, int endIndex){
        int leftChildIndex = getLeftChildIndex(index, endIndex);
        int rightChildIndex = getRightChildIndex(index, endIndex);

        if(leftChildIndex != -1 && array[leftChildIndex] > array[index]){
            swap(leftChildIndex, index);
            percolateDown(leftChildIndex, index);
        }

        if(rightChildIndex != -1 && array[rightChildIndex] > array[index]){
            swap(rightChildIndex, index);
            percolateDown(rightChildIndex, index);
        }

    }

    public void heapify(int endIndex){
        int index = getParentIndex(endIndex, endIndex);
        while (index >= 0){
            percolateDown(index, endIndex);
            index--;
        }
    }

    public void heapSort(){
        heapify(array.length -1);

        int endIndex = array.length -1;
        while (endIndex > 0){
            swap(0, endIndex);
            endIndex--;
            percolateDown(0, endIndex);
        }
    }

    public void printArray(){
        for(int a: array){
            System.out.print(a + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        HeapSort sort = new HeapSort();
        sort.printArray();
        sort.heapSort();
        sort.printArray();
    }
}
