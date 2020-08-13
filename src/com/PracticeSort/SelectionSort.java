package com.PracticeSort;

public class SelectionSort extends Sorting{

    public void sort(int[] list){
        for(int i=0; i<list.length; i++){
            for(int j=0; j<list.length; j++){
                if(list[i]<list[j]){
                    swap(list, i, j);
                }
            }
        }
    }
}
