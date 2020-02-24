package Java6;

import java.util.Scanner;

public class Summ {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Введите числа а < b");
        int a = inpt.nextInt(), b = inpt.nextInt();
        int c = a;
        int d;
        while (a < b) {
            d = a & 1;
            if (d != 0)
                System.out.println("Нечет: " + a);
            a++;
            c += a;
        }
        System.out.println("Сумма чисел от а до b " + c);
    }
}