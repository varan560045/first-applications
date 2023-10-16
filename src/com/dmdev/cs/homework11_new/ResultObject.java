package com.dmdev.lesson20.exception.homework11;

import java.util.List;

public class ResultObject {
    private List<String> value;
    private double averageMrks;

    public ResultObject(List<String> value, double averageMrks) {
        this.value = value;
        this.averageMrks = averageMrks;
    }

    @Override
    public String toString() {
        return "{" +
                value +
                ", средний балл=" + averageMrks +
                '}';
    }

    public List<String> getValue() {
        return value;
    }

    public double getAverageMrks() {
        return averageMrks;
    }
}
