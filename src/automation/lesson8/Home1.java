package automation.lesson8;

import java.util.*;

public class Home1 {
    public static void main(String[] args) {


        Random random = new Random();
        List<Integer> bucket1 = new ArrayList<>();
        List<Integer> bucket2 = new ArrayList<>();
        List<Integer> bucket3 = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(500));
        }

        for (int el : list){
            if (el % 2 == 0){
                bucket1.add(el);
            }
            else if (el % 3 == 0){
                bucket2.add(el);
            }
            else if ((el % 2 == 0) && (el % 3 ==0)){
                bucket1.add(el);
                bucket2.add(el);
            }
            else bucket3.add(el);
        }
        System.out.println(list);
        System.out.println(bucket1);
        System.out.println(bucket2);
        System.out.println(bucket3);

    }
}

/*
    Iterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
                if (iterator.next() % 2 == 0) {
                bucket1.add(iterator.next());
                } else if (iterator.next() % 3 == 0) {
                bucket2.add(iterator.next());
                } else if ((iterator.next() % 2 == 0) && (iterator.next() % 3 == 0)) {
                bucket1.add(iterator.next());
                bucket2.add(iterator.next());
                }
                else{
                bucket3.add(iterator.next());
                }
                }*/
