package Java4;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        int a = in.nextInt();
        if (a < 0) {
            System.out.println("a < 0");
        } else if (a > 100) {
            System.out.println("a > 100");
        } else if (a <= 14) {
            System.out.println("0 <= a <= 14");
        } else if (a <= 35) {
            System.out.println("15 <= a <= 35");
        } else if (a <= 50) {
            System.out.println("36 <= a <= 50");
        } else if (a <= 100) {
            System.out.println("51<= a <= 100");
        }
    }
}
