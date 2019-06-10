package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {


        return value >= 5;
    }

    public Boolean isLessThan7(Integer value) {
        return value<=7;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        return valueToEvaluate<=7 && valueToEvaluate>=5;
    }

    public Boolean startsWith(String string, Character character) {
        boolean checker = false;
        Character valueToCheck = string.toLowerCase().charAt(0);
        Character correctedChar = Character.toLowerCase(character);
        if (valueToCheck.compareTo(correctedChar) == 0){
            checker= true;
        }


        return checker;
    }
}
