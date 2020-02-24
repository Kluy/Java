package car;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car<Integer, Integer, String>> list = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        list.add(new Car<>(200,5, "Mazda"));
        list.add(new Car<>(700,6, "BMW"));
        list.add(new Car<>(110,4, "Mercedes"));
        list.add(new Car<>(500,2, "Dodge"));
        list.add(new Car<>(600,2, "Lexus"));
        list.add(new Car<>(1000,4, "Lexus"));

        System.out.println(list);

        System.out.println("Введите марку машины");
        String carName = in.nextLine();
        int b = 0;
        for (int i = 0; i < list.size(); i++) {
            if (carName.equals(list.get(i).getName())){
                System.out.println(list.get(i));
                b++;
            }
        }

        if (b == 0){
            System.out.println("Нет такой марки");
        }

        int sum = 0;
        ListIterator<Car<Integer,Integer,String>> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            int a = listIterator.next().getPrice();
            sum += a;
        }

        System.out.println("\nОбщая цена всех машин: " + sum + " грн.");

        sum = 0;
        ListIterator<Car<Integer,Integer,String>> listIterator2 = list.listIterator();
        while(listIterator2.hasNext()){
            int a = listIterator2.next().getWeight();
            sum += a;
        }

        System.out.println("Общий вес всех машин: " + sum + " кг");

        Collections.sort(list, new SortByName());
        System.out.println("\nСортировка по имени");
        System.out.println(list);

        Collections.sort(list, new SortByPrice());
        System.out.println("\nСортировка по цене");
        System.out.println(list);

        Collections.sort(list, new SortByWeight());
        System.out.println("\nСортировка по весу");
        System.out.println(list);
    }
}
