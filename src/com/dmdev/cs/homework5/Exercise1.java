package com.dmdev.homework5;

/**
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом.
 * Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */
public class Exercise1 {
    public static void main(String[] args) {
        String value = "С слоооожн ый матерриалЛ";
        System.out.println(removeDuplicates(value));
    }

    public static String removeDuplicates(String value) {
        value = value.toUpperCase();
        value = value.replace(" ", "");
        char[] values = value.toCharArray();
        char index = 0;
        int k = 0;

        for (char value1 : values) {
            if (index != value1) {
                values[k++] = value1;
                index = value1;
            }
        }
        return new String(values).substring(0, k);
    }
}
