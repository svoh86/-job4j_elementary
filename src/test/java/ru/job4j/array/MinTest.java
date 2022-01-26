package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinTest {

    @Test
    public void whenFirstMin() {
        int[] array = {0, 5, 10};
        int expected = 0;
        int rsl = Min.findMin(array);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenLastMin() {
        int[] array = {10, 5, 3};
        int expected = 3;
        int rsl = Min.findMin(array);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[] {10, 2, 5};
        int result = Min.findMin(array);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }
}