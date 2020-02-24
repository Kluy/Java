package Task2;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int a = in.nextInt();
        for (int i = 0; i < a; i++) {
            list.add((int)(1 + Math.random() * 1000000));
        }
        System.out.println(list);

        System.out.println(getMinimum(list));
    }

    private static int getMinimum(LinkedList<Integer> list) {
        int min = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
        }
        return min;
    }
}
