package homework9;

import java.util.List;

public class AverageAge extends User {
    public AverageAge() {
    }

    public static int getAverageAge(List<User> userList) {
        int result = 0;
        int currentCount = 0;
        for (User user : userList) {
            result += user.getAge();
            currentCount++;
        }
        return result / currentCount;
    }
}
