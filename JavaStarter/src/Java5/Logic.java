package Java5;

import java.util.Scanner;

public class Logic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа а и b");
        int a = in.nextInt(), b = in.nextInt();
//        if (a & b == a + 1)
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);

    }
}
