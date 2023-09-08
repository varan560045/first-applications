package com.dmdev.cs.homework1;

import java.util.Scanner;

/*
В переменной minutes лежит число от 0 до 59.
Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).

Протестировать функцию в main.
 */
public class Exercise1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int minutes = scanner.nextInt();
        if (isCorrectNumber(minutes)) {
            printQuarter(minutes);
        } else {
            System.out.println("Некорректное значение.");
        }
    }

    public static boolean isCorrectNumber(int minutes) {
        if (minutes <= 0 || minutes >= 60) {
            return false;
        } else {
            return true;
        }
    }

    public static void printQuarter(int minutes) {
        if (1 <= minutes && minutes <= 15) {
            System.out.println(minutes + " - это первая четверть часа");
        } else if (16 <= minutes && minutes <= 30) {
            System.out.println(minutes + " - это вторая четверть часа");
        }
        if (31 <= minutes && minutes <= 45) {
            System.out.println(minutes + " - это третья четверть часа");
        }
        if (46 <= minutes && minutes <= 59) {
            System.out.println(minutes + " - это четверная четверть часа");
        }


//        String result = switch (minutes){
//            case 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 -> minutes + " это первая четверть часа";
//            case 16,17,18,19,20,21,22,23,24,25,26,27,28,29,30 -> minutes + " это вторая четверть часа";
//            case 31,32,33,34,35,36,37,38,39,40,41,42,43,44,45 -> minutes + " это третья четверть часа";
//            case 46,47,48,49,50,51,52,53,54,55,56,57,58,59 -> minutes + " это четвертая четверть часа";
//            default -> "Month is invalid";
//        };
//        System.out.println(result);

    }
}