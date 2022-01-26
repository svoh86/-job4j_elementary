package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 1};
        int el = 5;
        int expected = 0;
        int rsl = FindLoop.indexOf(data, el);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = {5, 4, 3, 1};
        int el = 10;
        int expected = -1;
        int rsl = FindLoop.indexOf(data, el);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenFind7() {
        int[] data = new int[] {5, 7, 3};
        int el = 7;
        int result = FindLoop.indexOf(data, el);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 3;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}