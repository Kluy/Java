package Java5;

import java.util.Scanner;

public class Premium {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Введите стаж");
        int exp = inpt.nextInt();
        System.out.println("Введите ЗП");
        int zp = inpt.nextInt();
        if (exp < 5)
            System.out.println("Премия " + zp * 0.1 + "$");
        else if (exp < 10)
            System.out.println("Премия " + zp * 0.15 + "$");
        else if (exp < 15)
            System.out.println("Премия " + zp * 0.25 + "$");
        else if (exp < 20)
            System.out.println("Премия " + zp * 0.35 + "$");
        else if (exp < 25)
            System.out.println("Премия " + zp * 0.45 + "$");
        else
            System.out.println("Премия " + (int)(zp * 0.55) + "$");
    }
}