package com.dmdev.lesson20.exception.homework11;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.mapping;

/**
 * Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:
 * Средняя оценка студентов этого курса, количество оценок у которых больше 3-х
 * Список студентов данного курса, но только с полями Имя и Фамилия.
 * Список должен быть отсортированы по этим двум полям
 * Объект с двумя полями:
 * - Отсортированный список студентов с пункта 2
 * - Средняя оценка этих студентов
 */
public class StudentRunner {

    public static void main(String[] args) {

        List<Students> students = List.of(
                new Students("Sanya", "Usov", 1, List.of(5, 5, 4, 3, 5, 4, 5)),
                new Students("Dima", "Tihonin", 1, List.of(3, 4, 3, 5, 4, 5)),
                new Students("Sergey", "Kazakov", 2, List.of(3, 4, 5)),
                new Students("Diman", "Semeshin", 2, List.of(4, 4, 3, 5, 4, 5)),
                new Students("Artur", "Rusakov", 3, List.of(3, 3, 5)),
                new Students("Ilya", "Boev", 3, List.of(3, 4, 5, 5, 4, 5))
        );
        System.out.println(students);
        System.out.println();

        System.out.println("Фильтрация по среднему баллу:");
        Map<Integer, List<Double>> map = students.stream()
                .filter(students1 -> students1.getMarks().size() > 3)
                .collect(groupingBy(Students::getCourseNumber, mapping(Students::getAverageMark,
                        toList())));
        System.out.println(map);
        System.out.println();

        System.out.println("Фильтрация по имени и фамилии:");
        Map<Integer, List<String>> map2 = students.stream()
                .sorted(Comparator.comparing(Students::getName).thenComparing(Students::getLastName))
                .collect(groupingBy(Students::getCourseNumber,
                        mapping(Students::getStudentsName, toList())));

        System.out.println(map2);
    }
}
