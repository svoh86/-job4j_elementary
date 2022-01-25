package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        System.out.println("Размер массива " + ages.length);
        System.out.println("Размер массива " + surnames.length);
        System.out.println("Размер массива " + prices.length);

        String[] names = new String[4];
        names[0] = "Svistunov";
        names[1] = "Ivanov";
        names[2] = "Petrov";
        names[3] = "Sidorov";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

    }
}
