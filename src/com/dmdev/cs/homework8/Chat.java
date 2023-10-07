package homework8;

public class Chat {
    private String name;
    private int amount;

    public Chat(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "название='" + name + '\'' +
                ", количество участников=" + amount +
                '}';
    }
}
