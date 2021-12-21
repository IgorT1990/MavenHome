package automation.lesson3;

public class Sinus {
    public static void main(String[] args) {

      int counter = 0;
      int step = 10;
        do {
            System.out.println("Sin(" + counter +")");
            counter += step;

        } while (counter < 360);

    }}
