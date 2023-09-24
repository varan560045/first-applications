package homework4;

public class Floor {
    private int numberFloor;
    private int[] amountApartments;

    public Floor(int numberFloor, int[] amountApartments) {
        this.numberFloor = numberFloor;
        this.amountApartments = amountApartments;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    public int[] getAmountApartments() {
        return amountApartments;
    }

    public void setAmountApartments(int[] amountApartments) {
        this.amountApartments = amountApartments;
    }

    public void print(int numberFloor, int[] amountApartments){
        System.out.println("Этаж № " + numberFloor + " количество квартир: " + amountApartments.length);
    }
}
