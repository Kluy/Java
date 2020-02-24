package Java8;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите три числа");
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        System.out.println(five(a, b, c));
    }
    static String five(int a, int b, int c){
        return (float)a/5 + " " + (float)b/5 + " " + (float)c/5;
    }
}