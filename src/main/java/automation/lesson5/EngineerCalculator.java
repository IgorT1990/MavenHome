package automation.lesson5;

public class EngineerCalculator  {
    public static void main(String[] args) {

        if (Operations.operator == '+') {
            Operations operations = new Operations();
            double result = operations.add();
            System.out.println(result);
        }

        else if  (Operations.operator == '-') {
            Operations operations1 = new Operations();
            double result1 = operations1.remove();
            System.out.println(result1);
        }

        else if (Operations.operator == '*') {
            Operations operations2 = new Operations();
            double result2 = operations2.multiply();
            System.out.println(result2);
        }

        else if (Operations.operator == '/') {
            Operations operations3 = new Operations();
            double result3 = operations3.separate();
            System.out.println(result3);
        }

        else if (DataCalculator.getOperator() == '^') {
            Operations operations4 = new Operations();
            double result4 = operations4.exponentiation();
            System.out.println(result4);
        }

        else if (DataCalculator.getOperator() == '%') {
            Operations operations5 = new Operations();
            double result5 = operations5.divisionByRemainder();
            System.out.println(result5);
        }

        else if (DataCalculator.getOperator() == '#') {
            Operations operations6 = new Operations();
            double result6 = operations6.squareRoot();
            System.out.println(result6);
        }
        else {
            System.out.println("Try again");
        }
    }
}
