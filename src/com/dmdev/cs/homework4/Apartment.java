package homework4;

public class Apartment {
    private int numberApartments;
    private int[] amountRooms;

    public Apartment(int numberApartments, int[] amountRooms) {
        this.numberApartments = numberApartments;
        this.amountRooms = amountRooms;
    }

    public int getNumberApartments() {
        return numberApartments;
    }

    public void setNumberApartments(int numberApartments) {
        this.numberApartments = numberApartments;
    }

    public int[] getAmountRooms() {
        return amountRooms;
    }

    public void setAmountRooms(int[] amountRooms) {
        this.amountRooms = amountRooms;
    }

    public void print(int numberApartments, int[] amountRooms){
        System.out.println("Квартира № " + numberApartments + " количество комнат: " + amountRooms.length);
    }
}
