package com.dmdev.lesson25.homework13;

import java.util.Random;

public class Rocket {
    private int capacity;
    private int redCrystals;
    private int whiteCrystals;
    private final String mageType;

    public Rocket(String mageType) {
        this.mageType = mageType;
        capacity = new Random().nextInt(4) + 2;
    }

    public synchronized void loadCrystals(int redCrystals, int whiteCrystals) {
        this.redCrystals = redCrystals;
        this.whiteCrystals = whiteCrystals;
        System.out.println("Ракета " + mageType + " загрузила кристаллы: красных - " + redCrystals + "," +
                " белых - " + whiteCrystals);
    }

    public synchronized void fly() {
        System.out.println("Ракета " + mageType + " улетела с кристаллами: красных - " + redCrystals + "," +
                " белых - " + whiteCrystals);
    }
}

