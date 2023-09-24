package homework4;

import java.util.Arrays;

public class House {
    private int numberHouse;
    private int[] amountFloors;
    public House(int numberHouse, int[] amountFloors) {
        this.numberHouse = numberHouse;
        this.amountFloors = amountFloors;
    }

    public int getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(int numberHouse) {
        this.numberHouse = numberHouse;
    }

    public int[] getAmountFloors() {
        if (0 < amountFloors.length && amountFloors.length < 100){
            for (int i = 0; i < amountFloors.length; i++) {
                amountFloors[i] = i + 1;
            }
        }
        return amountFloors;
    }

    public void setAmountFloors(int[] amountFloors) {

        this.amountFloors = amountFloors;
    }

    public void print(int numberHouse, int[] amountFloors){
        System.out.println("Дом № " + numberHouse + " количество этажей: " +
                            amountFloors.length + Arrays.toString(getAmountFloors()));
    }

}
