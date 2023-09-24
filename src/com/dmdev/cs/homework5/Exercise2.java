package com.dmdev.homework5;

import java.nio.charset.StandardCharsets;
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
        System.out.println("Цифры из строки: " + values(value));
        String result = values(value);
        char[] charArray = result.toCharArray();
        int sum = sum(charArray);
        System.out.println(sum);
    }

    public static int sum(char[] charArray) {
        int sum = 0;

        int[] digits = new int[charArray.length];
        int digitsCount = 0;


        for (char c : charArray) {
            if (c >= '0' && c <= '9') {
                digits[digitsCount] = c - '0';
                digitsCount++;
            }
        }

        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }
        return sum;
    }

    public static String values(String value) {
        String v1 = "";
        char[] values = value.toCharArray();
        for (int i = 0; i < values.length; i++) {
            if (Character.isDigit(values[i])) {
                v1 += values[i];
            }
        }
        return v1;
    }
}
