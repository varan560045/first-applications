package com.dmdev.cs.homework2;

import java.util.Scanner;

/**
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число,
 * а возвращать количество четных цифр (вторая функция - нечетных).
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1)
 */
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int value = scanner.nextInt();

        System.out.println("Четных цифр: ");
        evenNumbers(value);
        System.out.println();
        System.out.println("Нечетных цифр: ");
        oddNumbers(value);
    }

    private static void evenNumbers(int value) {
        int result = 0;
        for (int i = (value > 0 ? value : value * -1); i > 0; i /= 10) {
            int even = i % 10;
            if (even % 2 == 0) {
                result++;
            }
        }
        System.out.print(result);
    }

    private static void oddNumbers(int value) {
        int result = 0;
        for (int i = (value > 0 ? value : value * -1); i > 0; i /= 10) {
            int odd = i % 10;
            if (odd % 2 != 0) {
                result++;
            }
        }
        System.out.print(result);
    }
}
