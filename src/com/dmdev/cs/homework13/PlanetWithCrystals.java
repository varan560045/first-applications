package com.dmdev.lesson25.homework13;

import java.util.Random;

public class PlanetWithCrystals {
    private int redCrystals;
    private int whiteCrystals;
    private final Random random;

    public PlanetWithCrystals() {
        random = new Random();
    }

    public synchronized void generateCrystals() {
        redCrystals = random.nextInt(4) + 1;
        whiteCrystals = random.nextInt(4) + 1;
        System.out.println("Наступила полночь...Выросли новые кристаллы: красные - "
                + redCrystals + ", белые - " + whiteCrystals);
    }

    public synchronized int collectRedCrystals(int amount) {
        if (redCrystals >= amount) {
            redCrystals -= amount;
            return amount;
        } else {
            int collectedAmount = redCrystals;
            redCrystals = 0;
            return collectedAmount;
        }
    }

    public synchronized int collectWhiteCrystals(int amount) {
        if (whiteCrystals >= amount) {
            whiteCrystals -= amount;
            return amount;
        } else {
            int collectedAmount = whiteCrystals;
            whiteCrystals = 0;
            return collectedAmount;
        }
    }
}

