package com.zipcodewilmington.assessment2.part2;


import java.util.LinkedHashMap;
import java.util.Map;


public class Router {
    Map <String, String> myMap = new LinkedHashMap<>();




    public void add(String path, String controller) {
        myMap.put(path, controller);
    }

    public Integer size() {
        return myMap.size();
    }

    public String getController(String path) {

        return myMap.get(path);
    }

    public void update(String path, String studentController) {
        myMap.put(path, studentController);
    }

    public void remove(String path) {
        myMap.remove(path);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, String> entry : myMap.entrySet()){
            result.append(entry.getKey()).append(entry.getValue()).append("\n");
        }


        return result.toString();
    }
}
