package Java4;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Введите два числа");
        int a = inpt.nextInt(), b = inpt.nextInt();
        System.out.println("Введите знак арифметической операции");
        String sign = inpt.next();
        switch (sign) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                if (b == 0)
                    System.out.println("На ноль делить нельзя");
                else
                    System.out.println(a / b);
                break;
            case "pow":
                System.out.println(Math.pow(a,b));
                break;
            case "sqrt":
                System.out.println(Math.sqrt(a) + ", " + Math.sqrt(b));
                break;
            default:
                System.out.println("Нет такого символа");
                break;
        }
    }
}
