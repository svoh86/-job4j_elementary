package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when5and8To5and12Then4() {
        Point a = new Point(5, 8);
        Point b = new Point(5, 12);
        double expected = 4;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMin1and15To23and8Then25() {
        Point a = new Point(-1, 15);
        Point b = new Point(23, 8);
        double expected = 25;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when0and0and0To5and5and5Then8dot66() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(5, 5, 5);
        double expected = 8.66;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMin5andMin5andMin5To5and5and5Then17dot32() {
        Point a = new Point(-5, -5, -5);
        Point b = new Point(5, 5, 5);
        double expected = 17.32;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}