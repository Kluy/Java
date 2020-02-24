package Java7;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Введите три числа");
        float a = inpt.nextInt(), b = inpt.nextInt(), c = inpt.nextInt();
        System.out.println(calculate(a,b,c));
    }
    static float calculate (float a, float b, float c) {
        return (a + b + c)/3;
    }
}