package automation.lesson8;

import java.util.*;

public class Home {

    public static void main(String[] args) {

        Random random = new Random();

        List<Integer> newList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(100));
        }

        boolean doAdd = true;
        for (int i = 0; i < list.size(); i++){
            Integer data = list.get(i);

            for (int j = 0; j < list.size(); j++)
            {

                if (i == j)
                {
                    break;
                }
                else if (list.get(j).equals(data))
                {
                    doAdd = false;
                    break;
                }
            }
            if (doAdd)
            {
                newList.add(data);
            }
            else
            {
                doAdd = true;
            }
        }
        System.out.println(list);
        System.out.println(newList);
    }
}







