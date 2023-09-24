package com.dmdev.homework5;

import java.util.Arrays;

/**
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * Написать 2 метода:
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * Посчитать сумму всех чисел из строки
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */
public class Exercise2 {
    public static void main(String[] args) {
        String value = "0Не1 м3енее сл5ожн7ый матер8иал";
        char[] values = value.toCharArray();

        System.out.println(Character.isDigit(values[0]));
        int size = 0;
        char[] values2;
        for (int i = 0; i < values.length - 1; i++) {
            if (Character.isDigit(values[i])){
                size++;
            }
        }
        values2 = new char[size];
        char index = 0;
        for (char c : values) {
            if (Character.isDigit(values[c])){
                index = values[c];

            }
        }

        System.out.println(Arrays.toString(values));




//        char[] v1 = value.toCharArray();
//        System.out.println(Arrays.toString(v1));
//        int index = 0;
//        char[] v2 = new char[];
//        for (int i = 1; i < v1.length; i++) {
//            if (!Character.isDigit(i)){
//                v2[index] = i;
//                System.out.println(Arrays.toString(v1));
//            }
//        }
    }
}
