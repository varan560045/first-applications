package com.dmdev.lesson25.homework13;

public class MageAir implements Runnable {
    private int redCrystalsCollected;
    private int whiteCrystalsCollected;
    private final Rocket rocket;
    private final PlanetWithCrystals planet;

    public MageAir(Rocket rocket, PlanetWithCrystals planet) {
        this.rocket = rocket;
        this.planet = planet;
        redCrystalsCollected = 0;
        whiteCrystalsCollected = 0;
    }

    @Override
    public void run() {
        while (redCrystalsCollected < 500 || whiteCrystalsCollected < 500) {
            planet.generateCrystals();
            int redCrystalsToCollect = 500 - redCrystalsCollected;
            int whiteCrystalsToCollect = 500 - whiteCrystalsCollected;
            int redCrystalsToLoad = planet.collectRedCrystals(redCrystalsToCollect);
            int whiteCrystalsToLoad = planet.collectWhiteCrystals(whiteCrystalsToCollect);
            rocket.loadCrystals(redCrystalsToLoad, whiteCrystalsToLoad);
            redCrystalsCollected += redCrystalsToLoad;
            whiteCrystalsCollected += whiteCrystalsToLoad;
            rocket.fly();
        }
        System.out.println("Маги Воздуха собрали нужное количество кристаллов и победили!");
    }
}



