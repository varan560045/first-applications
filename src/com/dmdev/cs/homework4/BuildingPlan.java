package homework4;

import java.util.Arrays;

public class BuildingPlan {

    public static int[] amountFloors = new int[11];
    public static int[] amountApartments = {123,124,125,126,127,128,129,130};
    public static int[] amountRooms = {1,2,3};
    public static void main(String[] args) {


        House house = new House(11,amountFloors);
        Floor floor = new Floor(7, amountApartments);
        Apartment apartment = new Apartment(130, amountRooms);
        Room room = new Room(true);

        printAllInformation(house, floor, apartment, room);
    }
    public static void printAllInformation(House house, Floor floor, Apartment apartment, Room room){
        house.print(house.getNumberHouse(), amountFloors);
        floor.print(floor.getNumberFloor(), amountApartments);
        apartment.print(apartment.getNumberApartments(), amountRooms);
        room.print(room.isTrough());
    }
}
