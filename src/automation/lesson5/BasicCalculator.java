package automation.lesson5;


public class BasicCalculator {
    public static void main(String[] args) {



        Operations operations = new Operations();
        int add = operations.add();
        System.out.println(add);

        Operations operations1 = new Operations();
        int remove = operations1.remove();
        System.out.println(remove);

        Operations operations2 = new Operations();
        int mul = operations2.multiply();
        System.out.println(mul);

        Operations operations3 = new Operations();
        int sep = operations3.separate();
        System.out.println(sep);
    }

}



