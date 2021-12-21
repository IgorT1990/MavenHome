package automation.lesson2;

public class Triangle {
    public static void main(String[] args) {
//        4.Написать программу, которая определяет, является ли треугольник со сторонами a, b, c равнобедренным.


    int a = 9;
    int b = 9;
    int c = 5;
    if (a == b || b == c || c == a) {
        System.out.println("Isosceles triangle");
    }
    else {
        System.out.println("Triangle is not isosceles");
    }
    }

}
