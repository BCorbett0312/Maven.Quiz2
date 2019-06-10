package com.zipcodewilmington.assessment2.part3;

import org.h2.mvstore.db.MVSecondaryIndex;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if(o1.getSpeed()>o2.getSpeed()) return 1;
        if(o1.getSpeed()<o2.getSpeed()) return -1;
        else return 0;
    }
}
