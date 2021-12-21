package automation.lesson7;
import java.util.Random;
import java.util.*;

public class CollectSort {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1000; i++){
            list.add(random.nextInt(1000));

        }



        long start = System.currentTimeMillis();
        sortList(new ArrayList<>(list));
        long end = System.currentTimeMillis();
        System.out.println("Sorted array list " + (end - start));


        start = System.currentTimeMillis();
        sortList(new LinkedList<>(list));
        end = System.currentTimeMillis();
        System.out.println("Sorted linked lst " + (end - start));


        start = System.currentTimeMillis();
        list.sort(Comparator.naturalOrder());
        end = System.currentTimeMillis();
        System.out.println("Sorted standart " + (end - start));
    }

    private static void sortList (List<Integer> list) {
        boolean needSort = true;
        while (needSort) {
            needSort = false;
            for (int i = 0; i<list.size(); i++) {
                if (list.get(i) > list.get(i+1)) {
                    int temp = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, temp);
                    needSort = true;
                }
            }
        }
    }
}
