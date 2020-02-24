package MyArea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите радиус круга");
        int radius = in.nextInt();
        System.out.println(MyArea.areaOfCircle(radius));
    }
}