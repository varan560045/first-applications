package com.dmdev.cs.homework3;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, которая принимает этот массив и разбивает на 3 других:
 * с только отрицательными числами, только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 * Пример:
 *                              [-4, -18]
 * [-4, 0, 1, 9, 0, -18, 3] ->  [0, 0]
 *                              [1, 9, 3]
 */
public class Exercise3 {
    public static void main(String[] args) {
        int[] values = {-4, 0, 1, 9, 0, -18, 3};
        int[][] formatArray = getFormatArray(values);
        printArray(getFormatArray(values));
    }

    private static int[][] getFormatArray(int[] values) {
        int sizeZero = 0;
        int sizePositive = 0;
        int sizeNegative = 0;

        for (int value : values) {
            if (value == 0) {
                sizeZero++;
            }else if (value > 0) {
                sizePositive++;
            }else if (value < 0) {
                sizeNegative++;
            }
        }
        int[][] formatArray = new int[3][];

        formatArray[0] = new int[sizeZero];
        formatArray[1] = new int[sizePositive];
        formatArray[2] = new int[sizeNegative];

        int zeroIndex = 0;
        int positiveIndex = 0;
        int negativeIndex = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] == 0) {
                formatArray[0][zeroIndex] = values[i];
                zeroIndex++;
            } else if (values[i] > 0) {
                formatArray[1][positiveIndex] = values[i];
                positiveIndex++;
            } else if (values[i] < 0) {
                formatArray[2][negativeIndex] = values[i];
                negativeIndex++;
            }
        }
        return formatArray;
    }

    private static void printArray(int[][] formatArray) {
        for (int[] values : formatArray) {
            for (int value : values) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
