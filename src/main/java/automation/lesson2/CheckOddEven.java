package automation.lesson2;

public class CheckOddEven {
    public static void main(String[] args) {

        int number = 7;
        if (number % 2 != 0) {
            System.out.println("Odd Number");
        } else {
            System.out.println("Even Number");
        }
        System.out.println("BYE");
        System.exit(number);
    }
}