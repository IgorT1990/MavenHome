package automation.lesson7;

import java.util.*;

public class Lesson7 {
    {

        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);

        int i = map.get("one");

        int j = map.getOrDefault("three", 5);

        Set<Integer> set = new HashSet<>();
        for (Integer i1 : set);


        List<Integer> values = new ArrayList<>(map.values());

        Set<String> set1 = map.keySet();
        for (String key : set1);



        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            entry.getKey();
            entry.getValue();
        }
    }
}