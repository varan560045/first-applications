package homework4;

public class Room {
    private boolean trough;

    public Room(boolean trough) {
        this.trough = trough;
    }

    public boolean isTrough() {
        return trough;
    }

    public void setTrough(boolean trough) {
        this.trough = trough;
    }

    public void print(boolean trough) {
        if (trough) {
            System.out.println("Есть проходная комната");
        }else {
            System.out.println("Нет проходной комнаты");
        }
    }
}
