package Java5;

import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt() & 1;
        if (a == 0)
            System.out.println("Число четное");
        else
            System.out.println("Число нечетное");
    }
}