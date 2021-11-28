package automation.lesson5;


public class BasicCalculator {
    public static void main(String[] args) {

        Operations operations = new Operations();
        operations.add().multiply().remove().separate();
        Operations result = operations.remove().add().multiply().separate();
        System.out.println(result);

    }

}



