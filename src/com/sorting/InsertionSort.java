package com.sorting;

public class InsertionSort extends Sorting{

    public void insertionSort(int[] list){
        for(int i=0;i<list.length -1; i++){
            for(int j=i+1;j>0; j--){
                if(list[j]<list[j-1]){
                    swap(list,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
}
