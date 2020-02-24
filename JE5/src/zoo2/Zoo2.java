package zoo2;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Zoo2 {
    public static void main(String[] args) {
        ArrayList <String> animalsList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String name;

        do {
            System.out.println("Введите название животного.");
            name = in.nextLine();
            if (name.equals("end") || name.equals("")){
                System.out.println("Заполнения списка окончено\n");
            } else {
                animalsList.add(name);
            }
        } while (!name.equals("end") && !name.equals(""));

        System.out.println("Список животных 1: " + animalsList);

       if (animalsList.size() > 7 ){
            animalsList.remove(7);
            animalsList.remove(5);
            animalsList.remove(3);
        } else if (animalsList.size() > 6){
            animalsList.remove(5);
            animalsList.remove(3);
        } else if (animalsList.size() > 3) {
            animalsList.remove(3);
        }

        System.out.println("Список животных 2: " + animalsList);

        System.out.println("Список животных.");

        ListIterator<String> listIterator = animalsList.listIterator();

        int i = 1;

        while (listIterator.hasNext()) {
            String string = listIterator.next();
            System.out.println(i + ". " + string);
            i++;
        }

        System.out.println();

        System.out.println("Колличество эллементов в списке: " + animalsList.size());
    }
}