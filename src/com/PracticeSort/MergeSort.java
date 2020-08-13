package com.PracticeSort;

public class MergeSort extends Sorting{

    private void split(int[] list, int[] firsthalf, int[] secondhalf){

        int index=0;
        int secondhalfStartIndex = firsthalf.length;

        for(int element: list){

            if(index< secondhalfStartIndex){
                firsthalf[index] = list[index];
            }else{
                secondhalf[index-secondhalfStartIndex] = list[index];
            }
            index++;
        }

    }

    private void merge(int[] list, int[] firsthalf, int[] secondhalf){
        int index =0;
        int firsthalfIndex =0;
        int secondhalfIndex=0;

        while(firsthalfIndex < firsthalf.length && secondhalfIndex < secondhalf.length){
            if(firsthalf[firsthalfIndex] < secondhalf[secondhalfIndex]){
                list[index] = firsthalf[firsthalfIndex];
                firsthalfIndex++;
            }else if(secondhalfIndex<secondhalf.length){
                list[index] = secondhalf[secondhalfIndex];
                secondhalfIndex++;
            }
            index++;
        }

        if(firsthalfIndex < firsthalf.length){
            while(index<list.length){
                list[index++] = firsthalf[firsthalfIndex++];
            }
        }

        if(secondhalfIndex< secondhalf.length){
            while (index<list.length){
                list[index++] = secondhalf[secondhalfIndex++];
            }
        }

    }

    public void sort(int[] list){
        if(list.length <=1){
            return;
        }

        int midpoint = list.length/2 + list.length%2;
        int[] firsthalf = new int[midpoint];
        int[] secondhalf = new int[list.length - midpoint];

        split(list, firsthalf, secondhalf);
        sort(firsthalf);
        sort(secondhalf);
        merge(list, firsthalf, secondhalf);
    }
}
