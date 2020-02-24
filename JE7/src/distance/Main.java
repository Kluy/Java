package distance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите растояние в километрах");
        double distance = in.nextDouble();
        Distance.Converter converter = new Distance().new Converter();
        System.out.println(converter.print(distance));
    }
}
