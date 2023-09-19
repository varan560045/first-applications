package com.dmdev.cs.homework2;

import java.util.Scanner;

/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 * Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 */
public class Exercise2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int value = scanner.nextInt();
        int revers = revers(value);
        System.out.println(revers);
    }

    private static int revers(int value) {
        int reversValue = 0;
        for (int valueToReverse = (value > 0 ? value : value * -1); valueToReverse > 0; valueToReverse /= 10) {
            int remainder = valueToReverse % 10;
            reversValue = reversValue * 10 + remainder;
        }
        return reversValue;
    }
}
