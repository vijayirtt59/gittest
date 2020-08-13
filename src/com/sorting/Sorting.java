package com.sorting;

public class Sorting {


    public void print(int[] list){
        for(int a: list){
            System.out.print(a + "     ");
        }
        System.out.println();
    }

    public void swap(int[] list, int firstIndex, int secondIndex){
        int temp = list[firstIndex];
        list[firstIndex] = list[secondIndex];
        list[secondIndex] = temp;
    }
}
