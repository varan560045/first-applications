package com.dmdev.cs.homework1;

/*
Даны два прямоугольных треугольника.
Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.

Для этого понадобится написать 2 функции.
Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше,
меньше или равен второму.
Учитывать, что площадь может быть вещественным числом.
 */
public class Exercise3 {
    public static void main(String[] args) {
        double a1 = 3;
        double b1 = 4;
        double a2 = 4;
        double b2 = 5;
        double triangle1 = calculateArea1(a1, b1);
        double triangle2 = calculateArea2(a2, b2);
        comparisonArea(triangle1, triangle2);
    }

    public static double calculateArea1(double a1, double b1) {
        double triangle1 = (a1 * b1) / 2;
        return triangle1;
    }

    public static double calculateArea2(double a2, double b2) {
        double triangle2 = (a2 * b2) / 2;
        return triangle2;
    }

    public static void comparisonArea(double triangle1, double triangle2) {
        if (triangle1 > triangle1) {
            System.out.println("Площадь первого треугольника больше площади второго треугольника");
        } else if (triangle1 < triangle2) {
            System.out.println("Площадь первого треугольника меньше площади второго треугольника");
        } else if (triangle1 == triangle2) {
            System.out.println("Площадь первого треугольника равна площади второго треугольника");
        }
    }
}
