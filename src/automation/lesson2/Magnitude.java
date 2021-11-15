package automation.lesson2;


public class Magnitude {
    public static void main(String[] args) {

        int a = 3;
        int b = -9;

       int a1 = Math.abs(a);
       int b1 = Math.abs(b);
        if (a1 - b1 > 0) {
        System.out.println(a + " имеет большую величину");
        }
        else {
            System.out.println(b + " имеет больую величину");
        }
}
}
