package DZ5;

import java.util.Scanner;

public class Premium_2 {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Введите стаж");
        int exp = inpt.nextInt();
        System.out.println("Введите ЗП");
        int zp = inpt.nextInt();
        float prem = 0.1f;
        if (exp < 5)
            System.out.println("Премия " + (int)(zp * prem) + "$");
        else if (exp >= 5 && exp < 10)
            System.out.println("Премия " + (int)(zp * (prem + 0.05)) + "$");
        else if (exp >= 10 && exp < 15)
            System.out.println("Премия " + (int)(zp * (prem + 0.15)) + "$");
        else if (exp >= 15 && exp < 20)
            System.out.println("Премия " + (int)(zp * (prem + 0.25)) + "$");
        else if (exp >= 20 && exp < 25)
            System.out.println("Премия " + (int)(zp * (prem + 0.35)) + "$");
        else if (exp >= 25)
            System.out.println("Премия " + (int)(zp * (prem + 0.45)) + "$");
    }
}