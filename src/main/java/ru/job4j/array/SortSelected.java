package ru.job4j.array;

public class SortSelected {
    /**
     * На первом этапе мы ищем минимальный элемент во всем массиве.
     * Далее ищем его индекс и меняем местами с нулевым элементом.
     * Повторяем процедуру поиска минимального элемента, но ищем уже с элемента с индексом 1.
     *
     * @param data массив
     * @return массив отсортированный выборкой
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            SwitchArray.swap(data, i, index);
        }
        return data;
    }
}
