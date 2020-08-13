package com.BinarySearch;

public class BinarySearch {

        public BinarySearch(){}

        public int binarySearch(int[] list, int number, int min, int max){
            if(min > max){
                return  -1;
            }
            int mid = min + (max - min)/2;
            if(list[mid] == number){
                return mid;
            }

            if(list[mid] > number){
                return binarySearch(list, number, min, mid -1);
            }else{
                return binarySearch(list, number, mid+1, max);
            }
        }

    public static int binarySearch1(int[] sortedArray, int number, int min, int max) {
        if (min > max) {
            return -1;
        }

        int mid = min + (max - min) / 2;
        if (sortedArray[mid] == number) {
            return mid;
        }

        if (sortedArray[mid] > number)  {
            return binarySearch1(sortedArray, number, min, mid - 1);
        } else {
            return binarySearch1(sortedArray, number, mid + 1, max);
        }
    }
}
