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
}