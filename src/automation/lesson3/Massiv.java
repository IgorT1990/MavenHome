package automation.lesson3;

import java.util.Arrays;
import java.util.Random;

public class Massiv {
    public static void main(String[] args) {
        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = getNum();
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int getNum() {
        Random random = new Random();
        return random.nextInt(100);

    }
}
