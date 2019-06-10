package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class ListUtility {
    List<Integer> myList = new ArrayList<>();
    public Boolean add(int i) {


        return myList.add(i);
    }

    public Integer size() {
        return myList.size();
    }

    public List<Integer> getUnique() {
        for(int i = 1; i < myList.size();i++){
            if (myList.get(i) == myList.get(i-1)){
                myList.remove(i);
            }
        }

        return myList;
    }

    public String join() {
        String myString = "";

        for(int i = 0; i < myList.size(); i ++) {
            if (i < myList.size() - 1) {
                myString += myList.get(i) + ", ";
            } else {
                myString += myList.get(i);
            }

        }
        return myString;
    }

    public Integer mostCommon() {
        //Collections.sort(myList);
        int highCount = 1;
        Integer res = myList.get(0);

        int currentCounter = 1;

        for (int i = 1; i< myList.size(); i ++){
            if(myList.get(i) == myList.get(i-1)){
                currentCounter++;
            }
            else{
                if(currentCounter > highCount){
                    highCount = currentCounter;
                    res = myList.get(i-1);
                }
                currentCounter = 1;
            }
        }

        if(currentCounter > highCount){
            highCount = currentCounter;
            res  = myList.get(myList.size()-1);
        }



        return res;
    }

    public Boolean contains(Integer valueToAdd) {


        return myList.contains(valueToAdd);
    }
}
