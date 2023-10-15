package com.dmdev.lesson20.exception.homework11;

import java.util.List;

/**
 * Дан список студентов с полями:
 * - Имя
 * - Фамилия
 * - Номер курса в университете
 * - Список оценок за учебу
 */
public class Students {

    private String name;
    private String lastName;
    private int courseNumber;
    private List<Integer> marks;


    public Students(String name, String lastName, int courseNumber, List<Integer> marks) {
        this.name = name;
        this.lastName = lastName;
        this.courseNumber = courseNumber;
        this.marks = marks;
    }

    public Students() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", courseNumber=" + courseNumber +
                ", markList=" + marks +
                '}';
    }

    public double getAverageMark() {
        double average = 0;
        int count = 0;
        for (Integer mark : marks) {
            average += mark;
            count++;
        }
        return average / count;
    }

    public String getStudentsName() {
        return name + " " + lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public List<Integer> getMarks() {
        return marks;
    }
}
