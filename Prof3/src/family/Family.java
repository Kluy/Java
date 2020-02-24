package family;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Family {
    public static void main(String[] args) {

        Map<String,String> people = new HashMap<>();

        people.put("Москва","Ивановы");
        people.put("Киев","Петровы");
        people.put("Лондон","Абрамовичи");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название города");
        String cityName = scanner.nextLine();
        if(people.get(cityName) == null){
            System.out.println("Нет такого города");
        } else {
            System.out.println("В " + cityName + "е живут " + people.get(cityName) + ".");
        }
    }
}
