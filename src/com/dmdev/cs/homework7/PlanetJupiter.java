package com.dmdev.homework7;

public class PlanetJupiter extends SpaceObject implements CalculatingGravity{
    private double diameter;
    private int equator;
    private int gravity;
    public PlanetJupiter(String name, int weight, int equator) {
        super(name, weight);
        this.equator = equator;
        this.diameter = diameter();
        this.gravity = gravity();
    }

    public String toString(){
        return "Объект: { Планета " + getName() +
                ", масса = " + getWeight() +
                ", диаметр = " + (int)diameter +
                ", длина экватора = " + equator +
                ", гравитационная постоянная = " + gravity + " }";
    }

    @Override
    public double diameter() {
        return equator / 3.14;
    }

    @Override
    public boolean isEqualWeight(SpaceObject spaceObject) {
        return this.getWeight() == spaceObject.getWeight();
    }

    @Override
    public int gravity() {
        return equator / 30;
    }

    public int getGravity() {
        return gravity;
    }
}
