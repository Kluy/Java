package price;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Price[] prices = new Price[4];
        String name;
        String storeName;
        int price;
        for (int i = 0; i < prices.length; i++) {
            System.out.println("Введите название товара");
            name = in.nextLine();
            System.out.println("Введите название магазина");
            storeName = in.nextLine();
            System.out.println("Введите цену товара");
            price = in.nextInt();
            prices[i] = new Price(name, storeName, price);
            in.nextLine();
        }

        for (Price priceNew : prices) {
            System.out.println(priceNew);
        }

        Arrays.sort(prices);

        for (Price priceNew : prices) {
            System.out.println(priceNew);
        }

        Arrays.sort(prices, new Comparator<Price>() {
            @Override
            public int compare(Price o1, Price o2) {
                return o1.getStoreName().compareTo(o2.getStoreName());
            }
        });

        System.out.println(Arrays.asList(prices));

        for (Price priceNew : prices) {
            System.out.println(priceNew);
        }

        System.out.println("Введите название магазина");
        String searchName = in.nextLine();
        try {
            for (int i = 0; i < prices.length; i++) {
                if (prices[i].getStoreName().equals(searchName)) {
                    System.out.println("Данные по магазину: " + prices[i].toString());
                    break;
                }
                if (i == prices.length - 1) {
                    throw new Exception();
                }
            }
        } catch (Exception e) {
            System.out.println("Нет такого магазина");
        }
    }
}