package homework8;

import java.util.Comparator;

public class AmountComparator implements Comparator<Chat> {
    @Override
    public int compare(Chat o1, Chat o2) {
        if (o1.getAmount() != o2.getAmount()) {
            return Integer.compare(o2.getAmount(), o1.getAmount());
        } else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
