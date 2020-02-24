package Java8;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму кредита");
        int credit = in.nextInt();
        loan(credit);
    }
    static void loan (int credit) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму платежа");
        int payment = in.nextInt();
        credit = credit - payment;
        if (credit == 0)
            System.out.println("Кредит погашен");
        else if (credit < 0) {
            System.out.println("Переплата " + (~credit + 1) + "$");
            loan(credit);
        }
        else {
            System.out.println("Долг " + credit + "$");
            loan(credit);
        }
    }
}