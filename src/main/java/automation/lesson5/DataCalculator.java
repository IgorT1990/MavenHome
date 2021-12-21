package automation.lesson5;
import java.util.Scanner;

public class DataCalculator {


    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        }
        return num;
    }

    public static double getDouble(){
        Scanner scanner = new Scanner(System.in);
        double num = 0;
        if (scanner.hasNextDouble()){
            num = scanner.nextDouble();
        }
        return num;
    }

    public static char getOperator() {
        Scanner scanner = new Scanner(System.in);
        char operator = 0;
        if (scanner.hasNext()){
            operator = scanner.next().charAt(0);
        }
        return operator;
    }

}
















