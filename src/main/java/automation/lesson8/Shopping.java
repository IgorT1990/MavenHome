package automation.lesson8;

import java.util.*;

public class Shopping {
    public static void main(String[] args) {

       List<Products> bag = new ArrayList<>();
       Products products1 = new Products("Bread", 3);
       bag.add(products1);
       Products products2 = new Products("Milk", 2);
       bag.add(products2);
       Products products3 = new Products("Eggs", 10);
       bag.add(products3);
       Products products4 = new Products("Onion", 4);
       bag.add(products4);
       Products products5 = new Products("Potato", 12);
       bag.add(products5);
       Products products6 = new Products("Tomato", 8);
       bag.add(products6);
       

       int result = 0;
       for (Products sumka : bag){
          for (int i = 0; i < bag.size(); i++){
             result = sumka.getAmount(i);
             result++;
       }

       System.out.println(result);
    }

}
}

