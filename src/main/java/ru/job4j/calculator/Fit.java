package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short heigt) {
        double rsl = (heigt - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short heigt) {
        double rsl = (heigt - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short heigt = 187;
        double man = Fit.manWeight(heigt);
        double woman = Fit.womanWeight(heigt);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 187 is " + woman);
    }
}
