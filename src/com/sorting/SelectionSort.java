package com.sorting;

public class SelectionSort extends Sorting {

    public void selectionSort(int[] list){

        for(int i=0; i<list.length; i++){
            for(int j=i+1; j<list.length; j++){
                if(list[i] > list[j]){
                    swap(list, i, j);
                }
            }
        }

    }
}
