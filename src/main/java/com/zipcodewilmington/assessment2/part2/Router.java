package com.zipcodewilmington.assessment2.part2;

import javafx.util.Pair;

import java.util.HashMap;

public class Router {
    HashMap myMap = new HashMap();



    public void add(String path, String controller) {
        myMap.put(path, controller);
    }

    public Integer size() {
        return myMap.size();
    }

    public String getController(String path) {

        return myMap.get(path).toString();
    }

    public void update(String path, String studentController) {
        myMap.put(path, studentController);
    }

    public void remove(String path) {
        myMap.remove(path);
    }
}
