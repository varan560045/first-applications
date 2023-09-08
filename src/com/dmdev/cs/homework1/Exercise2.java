package com.dmdev.cs.homework1;

import java.util.Scanner;

/*
Даны 3 переменные:
- operand1 (double)
- operand2 (double)
- operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
Протестировать функцию в main.
Например:
Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
Результат: 34.5 (24.4 + 10.1)
 */
public class Exercise2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число в формате 1,5 ; 2,2 ; 3,0: ");
        double operand1 = scanner.nextDouble();
        System.out.println("Введите первое число в формате 1,5 ; 2,2 ; 3,0: ");
        double operand2 = scanner.nextDouble();
        char operation = '/';
        calculate(operand1, operand2, operation);
    }

    public static void calculate(double operand1, double operand2, char operation) {
        double result = 0.0;
        if (operation == '+') {
            result = operand1 + operand2;
            System.out.println(operand1 + " + " + operand2 + " = " + result);

        } else if (operation == '-') {
            result = operand1 - operand2;
            System.out.println(operand1 + " - " + operand2 + " = " + result);

        } else if (operation == '*') {
            result = operand1 * operand2;
            System.out.println(operand1 + " * " + operand2 + " = " + result);

        } else if (operation == '/') {
            result = operand1 / operand2;
            System.out.println(operand1 + " / " + operand2 + " = " + result);

        } else if (operation == '%') {
            result = operand1 % operand2;
            System.out.println(operand1 + " % " + operand2 + " = " + result);

        }
    }
}
