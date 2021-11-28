package automation.lesson5;

public class Operations {

    private int num1 = DataCalculator.getInt();
    private int num2 = DataCalculator.getInt();
    private char operator = DataCalculator.getOperator();
    private int result;

    public Operations  add() {
        if (operator == '+') {
           this.result = num1 + num2;
        }
        return this;
    }

    public Operations remove() {
        if (operator == '-') {
            this.result = num1 - num2;
        }
        return this;

    }

    public Operations multiply() {
        if (operator == '*') {
            this.result = num1 * num2;
        }
        return this;
    }


    public Operations separate() {
        if (operator == '/') {
            this.result = num1 / num2;
        }
        return this;
    }

}

