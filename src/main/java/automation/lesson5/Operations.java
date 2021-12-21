package automation.lesson5;

public class Operations {

   private static final double num1 = DataCalculator.getDouble();
   public static final char operator = DataCalculator.getOperator();
   private static final double num2 = DataCalculator.getDouble();


    public  double remove() {
        double result = 0;
        if (operator == '-') {
            result = num1 - num2;
        }
        return result;
    }

    public  double add() {
       double result = 0;
        if (operator == '+') {
            result = num1 + num2;
        }
        return result;
    }

    public  double multiply() {
        double result = 0;
        if (operator == '*') {
            result = num1 * num2;
        }
        return result;
    }

    public  double separate() {
       double result = 0;
        if (operator == '/') {
            result = num1 / num2;
        }
        return result;
    }

    public  double exponentiation() {
        double result = 0;
        if (operator == '^'){
            result = Math.pow(num1,num2);
        }
        return result;
    }

    public  double divisionByRemainder() {
        double result = 0;
        if (operator == '%') {
            result = num1 % num2;
        }
        return result;
    }
    public double squareRoot() {
        double result = 0;
        if (operator == '#') {
            result = Math.sqrt(num1);
        }
        return result;
    }
}

