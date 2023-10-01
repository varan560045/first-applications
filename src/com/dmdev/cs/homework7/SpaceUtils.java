package com.dmdev.homework7;

public final class SpaceUtils {
    private SpaceUtils(SpaceObject spaceObject){
    }
    public static boolean isStar(SpaceObject spaceObject){
        return spaceObject instanceof Star;
    }
    public static int sumGravity(SpaceObject spaceObject1, SpaceObject spaceObject2){
        return (spaceObject1.getWeight() - spaceObject2.getWeight()) / 2;
    }

}
