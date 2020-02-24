package Java8;

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество клиентов");
        int a = in.nextInt();
        System.out.println(fct(a));
    }
    static int fct (int a){
        if (a == 0)
            return 1;
        else
            return a * fct(a - 1);
    }
}