package com.dmdev.cs.homework3;

import java.util.Arrays;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы
 * (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 */
public class Exercise1 {
    public static void main(String[] args) {
        int[] values = {3, 5, -6, 3, 2, -9, 0, -123};
        int[] values2 = getPositiveValues(values);
        System.out.println(Arrays.toString(values2));
    }
    public static int calculateSize(int[] values){
        int size = 0;
        for (int value : values) {
            if (value >= 0) {
                size++;
            }
        }
        return size;
    }
                            // 3, 5, -6, 3, 2, -9, 0, -123}
    private static int[] getPositiveValues(int[] values) {
        int[] values2 = new int[calculateSize(values)];
        int currentValue = 0;
        for (int i = 0; i < values.length; i++) {       // перемещаемся по элементам 1го массива
            if (values[i] >= 0){                        // проверяем на условие
                    values2[currentValue] = values[i];  // заносим значения во 2ой массив
                    currentValue++;                     // увеличиваем текущий индекс на 1
                }
            }
        return values2;
    }
}
