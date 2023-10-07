package homework9;

import java.util.ArrayList;
import java.util.List;

public class ChatRunner {

    public static void main(String[] args) {

        List<User> job = List.of(
                new User(1, "Alex", 18),
                new User(4, "Vik", 12),
                new User(11, "Misha", 35),
                new User(23, "Anna", 27),
                new User(18, "Sveta", 10)
        );
        List<User> neighbours = List.of(
                new User(5, "Olga", 37),
                new User(16, "Sergey", 33),
                new User(2, "Lena", 32),
                new User(20, "Nik", 19),
                new User(7, "Arkadiy", 47)
        );
        List<User> news = List.of(
                new User(9, "Max", 37),
                new User(14, "Gena", 29),
                new User(6, "Ivan", 15),
                new User(8, "Vova", 31)
        );
        List<User> friends = List.of(
                new User(25, "Viktor", 30),
                new User(17, "Dima", 32),
                new User(3, "Artur", 13),
                new User(19, "Sasha", 33)
        );
        List<User> drivers = List.of(
                new User(26, "BMW-vod", 34),
                new User(22, "Subarist", 36),
                new User(30, "Toyota-ved", 50),
                new User(24, "Mini", 17)
        );

        List<User> userList = new ArrayList<>();
        userList.addAll(SelectionUsers.selectionUsers(job));
        userList.addAll(SelectionUsers.selectionUsers(neighbours));
        userList.addAll(SelectionUsers.selectionUsers(news));
        userList.addAll(SelectionUsers.selectionUsers(friends));
        userList.addAll(SelectionUsers.selectionUsers(drivers));
        System.out.println(userList);

        System.out.println("Средний возраст пользователей: " + AverageAge.getAverageAge(userList));
    }
}
