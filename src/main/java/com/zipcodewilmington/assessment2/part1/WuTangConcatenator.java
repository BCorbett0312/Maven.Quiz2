package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    public WuTangConcatenator(Integer input) {
    }

    public Boolean isWu(Integer input) {
        Boolean checker = false;
        if (input%3 == 0){
            checker = true;
        }

        return checker;
    }

    public Boolean isTang(Integer input) {
        Boolean checker = false;
        if (input%5 == 0){
            checker = true;
        }

        return checker;
    }

    public Boolean isWuTang(Integer input) {
        Boolean checker = false;
        if (input%3 == 0 && input%5 == 0){
            checker = true;
        }

        return checker;
    }
}
