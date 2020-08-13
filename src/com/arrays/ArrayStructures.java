package com.arrays;

public class ArrayStructures {

    public int[] theArray = new int[150];
    public int arrSize = 10;


    public void generateRandomArray(){
        for(int i=0; i<arrSize; i++){
            theArray[i] = (int)(Math.random()*10)+10;
        }
    }

    public void printArray(){
        System.out.println("------");
        for(int i=0; i<arrSize; i++){
            System.out.println(i + " | " + theArray[i]);
            System.out.println("------");
        }
    }

    public static void main(String[] args) {
        ArrayStructures arrayStructures = new ArrayStructures();
        arrayStructures.generateRandomArray();
        arrayStructures.printArray();

        System.out.println(arrayStructures.getValueAtIndex(9));
        System.out.println(arrayStructures.doesArrayContainsValue(14));
    }

    public boolean doesArrayContainsValue(int value){
        boolean isExist = false;
        for(int i=0; i<arrSize; i++){
            if(theArray[i] == value){
                isExist = true;
                break;
            }
        }
        return isExist;
    }

    public int getValueAtIndex(int index){
        if(index < arrSize){
            return theArray[index];
        }else{
            return 0;
        }
    }
}
