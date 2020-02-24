package zoo;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        ArrayList <String> animalsList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String name;

        do {
            System.out.println("Введите название животного.");
            name = in.nextLine();
            if (name.equals("end") || name.equals("")){
                System.out.println("Заполнение списка закончено.");
            } else {
                animalsList.add(name);
            }
        } while (!name.equals("end") && !name.equals(""));

        System.out.println(animalsList);

        ListIterator<String> listIterator = animalsList.listIterator();
        int i = 1;
        while (listIterator.hasNext()) {
            String string = listIterator.next();
            System.out.println(i + ". " + string);
            i++;
        }
    }
}