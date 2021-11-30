package automation.lesson5;

public class BasicCalculator   {
    public static void main(String[] args) {

        if (Operations.operator == '+') {
            Operations operations = new Operations();
            double result = operations.add();
            System.out.println(result);
        }

        if  (Operations.operator == '-') {
            Operations operations1 = new Operations();
            double result1 = operations1.remove();
            System.out.println(result1);
        }

        if (Operations.operator == '*') {
            Operations operations2 = new Operations();
            double result2 = operations2.multiply();
            System.out.println(result2);
        }

        if (Operations.operator == '/') {
            Operations operations3 = new Operations();
            double result3 = operations3.separate();
            System.out.println(result3);
        }

    }

}




