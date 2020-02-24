package Java6;

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество клиентов");
        int a = in.nextInt();
        int b = 1;
        for (int i = a; i > 0; i--){
            b *= i;
        }
        System.out.println("Всего маршрутов: " + b);
    }
}