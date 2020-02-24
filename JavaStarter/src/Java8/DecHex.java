package Java8;

import java.util.Scanner;

public class DecHex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int a = in.nextInt();
        hex(a);
    }
    static void hex (int a) {
        int b = a % 16;
        if (a >= 16) {
            hex(a / 16);
        }
        if (b == 10)
            System.out.print("A");
        else if (b == 11)
            System.out.print("B");
        else if (b == 12)
            System.out.print("C");
        else if (b == 13)
            System.out.print("D");
        else if (b == 14)
            System.out.print("E");
        else if (b == 15)
            System.out.print("F");
        else
            System.out.print(b);
    }
}