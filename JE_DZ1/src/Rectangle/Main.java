package Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        Scanner in = new Scanner(System.in);

        System.out.println("Введите две стороны прямоугольника");

        double side1 = in.nextDouble();
        double side2 = in.nextDouble();

        rectangle.setSide1(side1);
        rectangle.setSide2(side2);

        System.out.println("Площадь: " + areaCalculator(side1, side2));
        System.out.println("Периметр: " + perimeterCalculator(side1, side2));

    }
    static double areaCalculator (double side1, double side2){
        return side1 * side2;
    }
    static double perimeterCalculator (double side1, double side2){
        return 2 * (side1 + side2);
    }
}