package Java7;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        rectangle();

        }

    static void rectangle () {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Введите стороны квадрата");
        int a = inpt.nextInt();
        int b = inpt.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}