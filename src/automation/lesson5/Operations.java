package automation.lesson5;

public class Operations {

    private static char operator = DataCalculator.getOperator();
    private int num1 = DataCalculator.getInt();
    private static int result;
    private int num2 = DataCalculator.getInt();



    public  int remove() {
        int result = 0;
        if (operator == '-') {
            result = num1 - num2;
        }
        return result;

    }
    public  int add() {
       int result = 0;
        if (operator == '+') {
            result = num1 + num2;
        }
        return result;
    }

    public  int multiply() {
        int result = 0;
        if (operator == '*') {
            result = num1 * num2;
        }
        return result;
    }


    public  int separate() {
       int result = 0;
        if (operator == '/') {
            result = num1 / num2;
        }
        return result;
    }


}

