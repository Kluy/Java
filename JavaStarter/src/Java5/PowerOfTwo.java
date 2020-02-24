package Java5;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner inpt = new Scanner(System.in);
        int a = inpt.nextInt() & 0;
        System.out.println(a);
//        if (a == 0)
//            System.out.println("Число четное");
//        else
//            System.out.println("Число нечетное");

    }
}