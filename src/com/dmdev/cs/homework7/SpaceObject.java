package com.dmdev.homework7;

public abstract class SpaceObject {
    private String name;
    private int weight;
    private double diameter;

    public SpaceObject(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public abstract double diameter();
    public abstract boolean isEqualWeight(SpaceObject spaceObject);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiameter() {
        return diameter;
    }

    public int getWeight() {
        return weight;
    }
}
