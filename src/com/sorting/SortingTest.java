package com.sorting;

public class SortingTest {

    public static void main(String[] args) {
        //SelectionSort sort = new SelectionSort();
        //BubbleSort bubble = new BubbleSort();
        //InsertionSort sort = new InsertionSort();
        //ShellSort sort = new ShellSort();
        //MergeSort sort = new MergeSort();
        QuickSort sort = new QuickSort();

        int[] list = {4,5,8,3,9,7,10,1,6,2};
        //sort.selectionSort(list);
        sort.quickSort(list, 0, list.length-1);
        sort.print(list);
    }
}
