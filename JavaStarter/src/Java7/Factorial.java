package Java7;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int a = in.nextInt();
        System.out.println(factorial(a));
    }

    static int factorial (int a) {
        int b = 1;
        for (int i = a; i > 0; i--) {
            b *= i;
        }
        return b;
    }
}