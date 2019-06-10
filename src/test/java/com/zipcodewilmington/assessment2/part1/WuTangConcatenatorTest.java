package com.zipcodewilmington.assessment2.part1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 3/1/18.
 */
public class WuTangConcatenatorTest {
    @Test
    public void testFive() {
        Integer input = 5;
        WuTangConcatenator wtc = new WuTangConcatenator(input);

        boolean isWu = wtc.isWu(5);
        boolean isTang = wtc.isTang(5);
        boolean isWuTang = wtc.isWuTang(5);

        Assert.assertFalse(isWu); // multiple of 3
        Assert.assertTrue(isTang); // multiple of 5
        Assert.assertFalse(isWuTang); // multiple of 15
    }

    @Test
    public void testThree() {
        Integer input = 3;
        WuTangConcatenator wtc = new WuTangConcatenator(input);

        boolean isWu = wtc.isWu(3);
        boolean isTang = wtc.isTang(3);
        boolean isWuTang = wtc.isWuTang(3);

        Assert.assertTrue(isWu); // multiple of 3
        Assert.assertFalse(isTang); // multiple of 5
        Assert.assertFalse(isWuTang); // multiple of 15
    }


    @Test
    public void testTen() {
        Integer input = 10;
        WuTangConcatenator wtc = new WuTangConcatenator(input);

        boolean isWu = wtc.isWu(10);
        boolean isTang = wtc.isTang(10);
        boolean isWuTang = wtc.isWuTang(10);

        Assert.assertFalse(isWu); // multiple of 3
        Assert.assertTrue(isTang); // multiple of 5
        Assert.assertFalse(isWuTang); // multiple of 15
    }


    @Test
    public void testSix() {
        Integer input = 6;
        WuTangConcatenator wtc = new WuTangConcatenator(input);

        boolean isWu = wtc.isWu(6);
        boolean isTang = wtc.isTang(6);
        boolean isWuTang = wtc.isWuTang(6);

        Assert.assertTrue(isWu); // multiple of 3
        Assert.assertFalse(isTang); // multiple of 5
        Assert.assertFalse(isWuTang); // multiple of 15
    }


    @Test
    public void testFifteen() {
        Integer input = 15;
        WuTangConcatenator wtc = new WuTangConcatenator(input);

        boolean isWu = wtc.isWu(15);
        boolean isTang = wtc.isTang(15);
        boolean isWuTang = wtc.isWuTang(15);

        Assert.assertTrue(isWu); // multiple of 3
        Assert.assertTrue(isTang); // multiple of 5
        Assert.assertTrue(isWuTang); // multiple of 15
    }
}
