package Java7;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Введите сумму и курс");
        int a = inpt.nextInt();
        float b = inpt.nextFloat();
        System.out.println(conv(a,b));
    }
    static float conv (int a, float b) {
        return a * b;
    }
}