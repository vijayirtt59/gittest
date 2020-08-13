package com.sorting;

public class BubbleSort extends Sorting {

    public void bubbleSort(int[] list){
        for(int i=0; i<list.length; i++){
            boolean swaped = false;
            for(int j=list.length-1; j>i; j--){
                if(list[j] < list[j-1]){
                    swap(list, j, j-1);
                    swaped=true;
                }
            }
            if(!swaped){
                break;
            }
        }
    }
}
