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
}