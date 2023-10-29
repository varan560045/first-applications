package com.dmdev.lesson25.homework13;

public class BattleRacesDemo {

    public static void main(String[] args) throws InterruptedException {

        PlanetWithCrystals planet = new PlanetWithCrystals();
        Rocket rocket1 = new Rocket("Магов огня");
        Rocket rocket2 = new Rocket("Магов воздуха");

        MageFire mageFire = new MageFire(rocket1, planet);
        MageAir mageAir = new MageAir(rocket2, planet);

        Thread fireMageThread = new Thread(mageFire);
        Thread airMageThread = new Thread(mageAir);

        fireMageThread.start();
        airMageThread.start();

        fireMageThread.join();
        airMageThread.join();
    }
}

