package Java7;

import java.util.Scanner;

public class NumbersCheck {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Введите число");
        int a = inpt.nextInt();
        check(a);
    }
    static void check (int a) {
        if (a < 0){
            System.out.println("Число a отрицательное");
        } else {

            int c = 0;
            for (int i = 2; i < 9; i++) {
                if (i == 4 || i == 7 || i == 8) {
                } else if (a % i == 0) {
                    c++;
                    System.out.println("Делится без остатка на " + i);
                }
            }
            if (c < 1)
                System.out.println("Число не делится без остатка ни на одно число из заданного диапазона");

            c = 0;
            for (int i = 1; i < a; i++ ){
                int b = a % i;
                if (b == 0) {
                    c++;
                } else if (c > 1) {
                    System.out.println("Число сложное");
                    break;
                }
            }
            if (c == 1)
                System.out.println("Число простое");
        }
    }
}