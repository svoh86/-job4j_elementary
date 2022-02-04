package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax3To1Then3() {
        int left = 3;
        int right = 1;
        int expected = 3;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int expected = 3;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax5To3To6Then6() {
        int left = 5;
        int right = 3;
        int third = 6;
        int expected = 6;
        int result = Max.max(left, right, third);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax15To3To6To10Then10() {
        int left = 15;
        int right = 3;
        int third = 6;
        int four = 10;
        int expected = 15;
        int result = Max.max(left, right, third, four);
        Assert.assertEquals(expected, result);
    }
}