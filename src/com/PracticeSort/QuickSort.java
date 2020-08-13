package com.PracticeSort;

public class QuickSort extends Sorting{


    private int partition(int[] list, int low, int high){
        int l = low;
        int h= high;
        int pivot = list[low];

        while(l<h){
            while(list[l]<= pivot && l<h){
                l++;
            }
            while(list[h] > pivot){
                h--;
            }
            if(l<h){
                swap(list, l, h);
            }
        }
        swap(list, low, h);
        System.out.println("Pivot: " + pivot);
        printSort(list);
        return h;
    }

    public void quicksort(int[] list, int low, int high){
        if(low >= high){
            return;
        }
        int pivotIndex = partition(list, low, high);
        quicksort(list, low, pivotIndex-1);
        quicksort(list, pivotIndex+1, high);
    }
}
