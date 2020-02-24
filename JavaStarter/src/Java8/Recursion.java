package Java8;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int a = in.nextInt();
        rec(a);
    }
    static void rec (int a) {
        System.out.println(a);
        a--;
        if (a != 0) {
            rec(a);
        }
        System.out.println(a);
    }
}