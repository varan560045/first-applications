package homework8;

import java.util.*;

public class ChatRunner {

    public static void main(String[] args) {

        List<Chat> chats = List.of(
                new Chat("Работа", 760),
                new Chat("Соседи", 2349),
                new Chat("Новости", 6008),
                new Chat("Друзья", 32),
                new Chat("Приколы", 6008),
                new Chat("Драйв2", 5837)
        );
        List<Chat> newChats = new ArrayList<>(chats);

        for (Iterator<Chat> newChatsIterator = newChats.iterator(); newChatsIterator.hasNext(); ) {
            Chat next = newChatsIterator.next();
            if (next.getAmount() < 1000) {
                newChatsIterator.remove();
            }
        }
        System.out.println(newChats);

        newChats.sort(new AmountComparator());
        System.out.println(newChats);

        newChats.sort(new NameComparator());
        System.out.println(newChats);

        Collections.sort(newChats, new NameComparator());
        System.out.println(newChats);

    }
}
