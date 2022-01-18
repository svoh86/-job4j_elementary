package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan180Then92() {
       short heigt = 180;
       double expected = 92;
       double rsl = Fit.manWeight(heigt);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenWoman170Then69() {
        short heigt = 170;
        double expected = 69;
        double rsl = Fit.womanWeight(heigt);
        Assert.assertEquals(expected, rsl, 0.01);
    }
}