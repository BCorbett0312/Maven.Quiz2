package com.zipcodewilmington.assessment2.part2;



import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        int arrayLength = array1.length+array2.length;
        Integer intArray[];
        intArray = new Integer[arrayLength];
        int index;

        for(index = 0; index < array1.length; index++){

            intArray[index] = array1[index];

        }

        for(int j=0; j < array2.length; j++){
            intArray[index] = array2[j];
            index++;
        }



        return intArray;
    }

    public Integer[] rotate(Integer[] array, Integer rotateBy) {
        for(int i = 0; i< rotateBy; i++){
            rotateByOne(array, array.length);


        }


        return array;
    }

    void rotateByOne(Integer array[], int lengthOfArray){
        int i;
        int temp = array[0];
        for(i = 0; i < lengthOfArray-1; i++){
            array[i] = array[i+1];

        }
        array[i] = temp;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer counter = 0;

        for(int i = 0; i < array1.length; i++){
            if(array1[i] == valueToEvaluate){
                counter++;
            }
        }

        for (int i = 0; i < array2.length; i++){
            if(array2[i]== valueToEvaluate){
                counter++;
            }
        }

        return counter;
    }

    public Integer mostCommon(Integer[] array) {
        Arrays.sort(array);
        int highCount = 1;
        Integer res = array[0];

        int currentCounter = 1;

        for (int i = 1; i< array.length; i ++){
            if(array[i] == array[i-1]){
                currentCounter++;
            }
            else{
                if(currentCounter > highCount){
                    highCount = currentCounter;
                    res = array[i-1];
                }
                currentCounter = 1;
            }
        }

        if(currentCounter > highCount){
            highCount = currentCounter;
            res  = array[array.length-1];
        }



        return res;
    }


}
