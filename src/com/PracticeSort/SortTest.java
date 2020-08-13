package com.PracticeSort;


public class SortTest {

    public static void main(String[] args) {
        int[] list = {3,5,8,9,2,6,4,1,7};

        //SelectionSort sort = new SelectionSort();
        //BubbleSort sort = new BubbleSort();
        //InsertionSort sort = new InsertionSort();
        //Insertionsort sort = new Insertionsort();
        //ShellSort sort = new ShellSort();
        //MergeSort sort = new MergeSort();
        QuickSort sort = new QuickSort();

        System.out.println("Before Sort..............");
        sort.printSort(list);
        sort.quicksort(list, 0, list.length -1);

        System.out.println("After Sort..............");
        sort.printSort(list);
    }
}
