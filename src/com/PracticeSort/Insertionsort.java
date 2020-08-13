package com.PracticeSort;

public class Insertionsort extends Sorting {

    public void sort(int[] list){
        for(int i=0; i<list.length; i++){
            for(int j=i+1; j>0; j--){
                if(list[j]< list[j-1]){
                    swap(list,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
}
