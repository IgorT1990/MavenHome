package automation.lesson3;
import java.util.Random;

public class Aver {
    public static void main(String[] args) {

            int[] arr = new int[10];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = getNum();
            }
            int sum = 0;
             for (int j : arr) {
            sum += j;
             }
             int average = sum / arr.length;

            System.out.println(average);
    }


        private static int getNum() {
            Random random = new Random();
            return random.nextInt(100);
        }
}

