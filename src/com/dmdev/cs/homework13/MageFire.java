package com.dmdev.lesson25.homework13;

public class MageFire implements Runnable {
    private int redCrystalsCollected;
    private int whiteCrystalsCollected;
    private final Rocket rocket;
    private final PlanetWithCrystals planet;

    public MageFire(Rocket rocket, PlanetWithCrystals planet) {
        this.rocket = rocket;
        this.planet = planet;
        redCrystalsCollected = 0;
        whiteCrystalsCollected = 0;
    }

    @Override
    public void run() {
        while (redCrystalsCollected < 500 || whiteCrystalsCollected < 500) {  // условие
            planet.generateCrystals();                                  // генерация кристаллов
            int redCrystalsToCollect = 500 - redCrystalsCollected;      // необходимо собрать еще
            int whiteCrystalsToCollect = 500 - whiteCrystalsCollected;  // необходимо собрать еще
            int redCrystalsToLoad = planet.collectRedCrystals(redCrystalsToCollect); // загружено в ракету
            int whiteCrystalsToLoad = planet.collectWhiteCrystals(whiteCrystalsToCollect); // загружено в ракету
            rocket.loadCrystals(redCrystalsToLoad, whiteCrystalsToLoad);// загруженные кристаллы
            redCrystalsCollected += redCrystalsToLoad;                  // всего собрано красных
            whiteCrystalsCollected += whiteCrystalsToLoad;              // всего собрано белых
            rocket.fly();                                               // ракета улетела
        }
        System.out.println("Маги Огня собрали нужное количество кристаллов и победили!");
    }
}


