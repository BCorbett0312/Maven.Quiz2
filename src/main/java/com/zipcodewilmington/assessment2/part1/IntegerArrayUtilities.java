package com.zipcodewilmington.assessment2.part1;

import java.lang.reflect.Array;


public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length%2 == 0;
    }

    public Integer[] range(Integer start, Integer stop) {
        int arrayLength = (stop - start)+1;
        Integer intArray[];
        intArray = new Integer[arrayLength];
        int index = 0;
        System.out.println(arrayLength);
        for(int i = start; i<= stop; i++){
            intArray[index] = i;
            index++;

        }
        return intArray;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        Integer sum = 0;

        for(int i = 0; i <=1; i++){
            sum+= array[i];
        }

        return sum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        Integer product = 1;

        for(int i = array.length-1; i>array.length-3; i--){
            product *= array[i];
        }

        return product;
    }
}
