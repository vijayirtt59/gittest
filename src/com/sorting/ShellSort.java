package com.sorting;

public class ShellSort extends Sorting{


    private void insertionSort(int[] list, int startIndex, int increment){
        for(int i=startIndex; i<list.length; i=i+increment){
            for(int j= Math.min(i+increment, list.length-1); j-increment>=0; j=j-increment){
                if(list[j]<list[j-increment]){
                    swap(list,j,j-increment);
                }else{
                    break;
                }
            }
        }
    }

    public void shellSort(int[] list){
        int increment = list.length/2;
        while (increment>=1) {
            for (int startIndex = 0; startIndex < increment; startIndex++) {
                insertionSort(list, startIndex, increment);
            }
            increment = increment / 2;
        }
    }
}
