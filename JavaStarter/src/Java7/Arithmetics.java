package Java7;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Введите два числа");
        int a = inpt.nextInt(), b = inpt.nextInt();
        System.out.println("Введите знак арифметической операции");
        String sign = inpt.next();
        switch (sign) {
            case "+":
                add(a,b);
                break;
            case "-":
                sub(a,b);
                break;
            case "*":
                mul(a,b);
                break;
            case "/":
                div(a,b);
                break;
            default:
                System.out.println("Нет такого символа");
                break;
        }
    }
    static void add (int a, int b) {
        System.out.println(a + b);
    }
    static void sub (int a, int b) {
        System.out.println(a - b);;
    }
    static void mul (int a, int b) {
        System.out.println(a * b);
    }
    static void div (float a, float b) {
        if (b == 0) {
            System.out.println("На ноль делить нельзя");
        } else {
            System.out.println(a / b);
        }
    }
}