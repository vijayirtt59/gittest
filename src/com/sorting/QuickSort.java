package com.sorting;

import java.util.*;

public class QuickSort extends Sorting{

    private  int partition(int[] listToSort, int low, int high){
        int pivot = listToSort[low];
        int l = low;
        int h = high;

        while(l<h){
            while(listToSort[l]<=pivot && l<h){
                l++;
            }
            while(listToSort[h]>pivot){
                h--;
            }
            if(l<h){
                swap(listToSort, l, h);
            }
        }
        swap(listToSort,low,h);
        System.out.println("Pivot: " + pivot);

        print(listToSort);
        return h;
    }

    public void quickSort(int[] listToSort, int low, int high){
        if(low >= high){
            return;
        }

        int pivotIndex = partition(listToSort, low, high);
        quickSort(listToSort, low, pivotIndex-1);
        quickSort(listToSort, pivotIndex+1, high);
    }
}
