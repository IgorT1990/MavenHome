package automation.lesson4;

import java.util.Arrays;
import java.util.Random;

public class Data {
    public static void main(String[] args) {
        String[] arr;
        int noOfPlayers = 4;
        CardValue cardValue = new CardValue();
        arr = cardValue.card();
        System.out.println(Arrays.toString(arr));

        for (int round = 1; round < 6; round++){
            System.out.printf("%d round %n", round);


                 for (int player = 1; player <= noOfPlayers; player++) {
                     Random random = new Random();
                         for (int j = 0; j < 1; j++) {
                         String newArray = arr[random.nextInt(arr.length)];

                         System.out.printf("Player %d gets %s%n", player, newArray);
                 }
             }

                 System.out.println("+++++++++++++++++++++++++");
        }

    }

}

