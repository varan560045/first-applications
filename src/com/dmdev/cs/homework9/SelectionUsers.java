package homework9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SelectionUsers extends User {
    private SelectionUsers() {
        super();
    }

    public static List selectionUsers(List<User> userList) {
        List<User> newUserList = new ArrayList<>(userList);


        for (Iterator<User> newUserListIterator = newUserList.iterator(); newUserListIterator.hasNext(); ) {
            User next = newUserListIterator.next();
            if (next.getAge() <= 18) {
                newUserListIterator.remove();
            }
        }
        return newUserList;
    }
}
