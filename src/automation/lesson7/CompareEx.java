package automation.lesson7;

import java.util.*;

public class CompareEx {
    public static void main(String[] args) {
/*
        Set<User> userSet = new TreeSet<>();
        User user1 = new User("Mike");
        user1.setAge(18);

        User user2 = new User("Jon");
        user2.setAge(20);

        User user3 = new User("Nick");
        user3.setAge(25);

        User user4 = new User("Anna");
        user4.setAge(15);


        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);
        userSet.add(user4);


        System.out.println(userSet);
    }
}*/

        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));

        nums.sort(new MyComparator());

        System.out.println(nums);
    }
}
