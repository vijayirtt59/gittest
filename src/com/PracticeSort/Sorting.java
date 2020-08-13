package com.PracticeSort;

public class Sorting {

    public void printSort(int[] list){
        for(int a: list){
            System.out.print(a + " ");
        }
        System.out.println(" ");
    }

    public void swap(int[] list, int i, int j){
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
}
