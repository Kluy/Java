package Java6;

import java.util.Scanner;

public class Figures {
    public static void main(String[] args) {

        Scanner inpt = new Scanner(System.in);
        System.out.println("Введите число");
        int a = inpt.nextInt();

        System.out.println("Прямоугольник");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Равносторонний треугольник");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = a + 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Треугольник");
        for (int i = a; i > 0; i--) {
            for (int j = a; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Равносторонний треугольник");

        int c = 0;
        for (int i = a; i > 0; i --) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= c; j++) {
                System.out.print("*");
            }
            c += 2;
            System.out.println();
        }

        System.out.println("Ромб");
        int d = 0;
        for (int i = a; i > 0; i --) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= d; j++) {
                System.out.print("*");
            }
            d += 2;
            System.out.println();
        }
        System.out.println(d);
        for (int i = a; i > 0; i--) {
            for (int j = a; j >= i - 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j < d - 2; j++) {
                System.out.print("*");
            }
            d -= 2;
            System.out.println();
        }
    }
}