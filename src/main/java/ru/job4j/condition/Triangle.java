package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public static void main(String[] args) {
        boolean rsl = exist(3, 4, 5);
        String label = rsl ? "Треугольник существует" : "Треугольник не существует";
        System.out.println(label);
    }
}
