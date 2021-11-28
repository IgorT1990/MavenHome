package automation.lesson5;


public class BasicCalculator {
    public static void main(String[] args) {
        System.out.println("Enter your fist number and press Enter");
        int num1 = DataCalculator.getInt();

        System.out.println("Enter your operator and press Enter");
        char operator = DataCalculator.getOperator();

        System.out.println("Enter you second number and press Enter");
        int result = 0;
        int num2 = DataCalculator.getInt();

        switch (operator) {
            case '+': {
                result = num1 + num2;
                break;
            }
            case '-': {
                result = num1 - num2;
                break;
            }
            case '/': {
                result = num1 / num2;
                break;
            }
            case '*': {
                result = num1 * num2;
                break;
            }
            case ('%'): {
                result = num1 % num2;
            }
            default:
                System.out.println("Something went wrong, try again later");
        }
            System.out.println("This is your result: \n" + result);

        }
    }

