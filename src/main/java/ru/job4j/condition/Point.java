package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result1 = Point.distance(5, 8, 5, 12);
        double result2 = Point.distance(-1, 15, 23, 8);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (5, 8) to (5, 12) " + result1);
        System.out.println("result (-1, 15) to (23, 8) " + result2);
    }
}
