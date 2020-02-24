package Java9;

import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int a = in.nextInt();
        int [] arr = new int [a];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * arr.length + arr.length - 2;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }

        System.out.println("max: " + max);

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }

        System.out.println("min: " + min);

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int average = sum/arr.length;

        System.out.println("average: " + average);
        System.out.println("sum: " + sum);

        System.out.print("even: ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                System.out.print(arr[i] + " ");
        }
    }
}