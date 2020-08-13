package com.sorting;

public class MergeSort extends Sorting {

    private void split(int[] listToSort, int[] firstHalfList, int[] secondHalfList){

        int index =0;
        int secondHalfStartindex = firstHalfList.length;

        for(int element : listToSort){
            if(index < secondHalfStartindex){
                firstHalfList[index] = listToSort[index];
            }else{
                secondHalfList[index-secondHalfStartindex] = listToSort[index];
            }
            index++;
        }
    }

    private void merge(int[] listToSort, int[] firstHalfList, int[] secondHalfList){
        int mergeSortindex =0;
        int firstHalfListIndex =0;
        int secondHalfListIndex =0;

        while(firstHalfListIndex < firstHalfList.length && secondHalfListIndex < secondHalfList.length){
            if(firstHalfList[firstHalfListIndex] < secondHalfList[secondHalfListIndex]){
                listToSort[mergeSortindex] = firstHalfList[firstHalfListIndex];
                firstHalfListIndex++;
            }else if(secondHalfListIndex < secondHalfList.length){
                listToSort[mergeSortindex] = secondHalfList[secondHalfListIndex];
                secondHalfListIndex++;
            }
            mergeSortindex++;
        }

        if(firstHalfListIndex <firstHalfList.length){
            while(mergeSortindex < listToSort.length){
                listToSort[mergeSortindex++] = firstHalfList[firstHalfListIndex++];
            }
        }

        if(secondHalfListIndex < secondHalfList.length){
            while(mergeSortindex < listToSort.length){
                listToSort[mergeSortindex++] = secondHalfList[secondHalfListIndex++];
            }
        }
    }

    public void mergeSort(int[] listToSort){
        if(listToSort.length == 1){
            return;
        }

        int midPoint = listToSort.length/2 + listToSort.length%2;
        int[] firsthalfList = new int[midPoint];
        int[] secondhalfList = new int[listToSort.length - midPoint];

        split(listToSort, firsthalfList, secondhalfList);

        mergeSort(firsthalfList);
        mergeSort(secondhalfList);

        merge(listToSort, firsthalfList, secondhalfList);

    }
}
