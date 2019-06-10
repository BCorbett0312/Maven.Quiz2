package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {
    List<Integer> myList = new ArrayList<>();
    public Boolean add(int i) {


        return myList.add(i);
    }

    public Integer size() {
        return myList.size();
    }

    public List<Integer> getUnique() {
        return null;
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
        return null;
    }

    public Boolean contains(Integer valueToAdd) {


        return myList.contains(valueToAdd);
    }
}
