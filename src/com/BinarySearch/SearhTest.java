package com.BinarySearch;

public class SearhTest {


    public static void main(String[] args) {
        int[] list = {3,5,8,9,2,6,4,1,7};
        BinarySearch search = new BinarySearch();
        System.out.println(search.binarySearch1(list, 9, 0, list.length-1));
    }





}
