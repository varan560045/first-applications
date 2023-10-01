package com.dmdev.homework7;

public class SpaceRunner {
    public static void main(String[] args) {
        Comet comet = new Comet("Варшавская", 200, 100);
        PlanetJupiter planetJupiter = new PlanetJupiter("Юпитер", 900, 800);
        PlanetSaturn planetSaturn = new PlanetSaturn("Сатурн", 700, 600);
        SatelliteEarth satelliteEarth = new SatelliteEarth("Луна", 50, 40);
        SatelliteJupiter satelliteJupiter = new SatelliteJupiter("Каллисто", 70, 60);
        Star star = new Star("Полярная", 10000, 9000);
        SpaceObject betelgeyze = new Star("Бетельгейзе", 40000, 15000);
        System.out.println(comet.diameter());
        System.out.println(planetJupiter.gravity());
        System.out.println(SpaceUtils.isStar(star));
        System.out.println(SpaceUtils.sumGravity(planetJupiter, satelliteJupiter));
        System.out.println(planetJupiter.isEqualWeight(satelliteJupiter));
        System.out.println(SpaceUtils.isStar(betelgeyze));
        System.out.println(star.toString());
    }
}
