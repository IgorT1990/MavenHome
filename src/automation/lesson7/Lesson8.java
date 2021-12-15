package automation.lesson7;

import java.util.HashMap;
import java.util.Map;

public class Lesson8 {
    public static void main(String[] args) {

        User user = new User("mike");

        Map<User, String> userMap = new HashMap<>();
        userMap.put(user, "value");

        user.setRole("admin");
        System.out.println(user.hashCode());

        System.out.println(userMap.get(user));

        System.out.println(userMap);

    }
}
