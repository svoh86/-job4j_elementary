package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int rsl = left >= right ? left : right;
        return rsl;
    }

    public static void main(String[] args) {
        int rsl = Max.max(10, 20);
        System.out.println(rsl);
    }
}
