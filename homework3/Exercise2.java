package com.dmdev.cs.homework3;

import java.util.Arrays;

/**
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа
 * (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 * <p>
 * Далее определить среднее арифметическое всех элементов целочисленного массива и
 * вывести на консоль только те элементы, которые больше этого среднего арифметического.
 */
public class Exercise2 {
    public static void main(String[] args) {
        char[] chars = {'a', '6', 'y', 'P', '9', '+'};
        int[] values = values(chars);
        System.out.println("Преобразованный массив:");
        System.out.println(Arrays.toString(values));
        System.out.println("Среднее арифметическое:");
        System.out.println(average(values));
        System.out.println("Элементы массива, которые больше среднего арифметического:");
        print(values, average(values));
    }

    public static int[] values(char[] chars) {
        int[] values = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                values[i] = (int) chars[i];
                values[i]++;
            }
        }
        return values;
    }

    public static int average(int[] values) {
        int average = 0;
        for (int i = 0; i < values.length; i++) {
            average += values[i];
        }
        return average / values.length;
    }

    public static void print(int[] values, int average) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] > average) {
                System.out.print(values[i] + " ");
            }
        }
    }
}
