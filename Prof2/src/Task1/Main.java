package Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ArrayList <String> list = new ArrayList<>();
        ArrayList <String> list = new ArrayList<>(Arrays.asList("a","b","c","d","e"));
//        Scanner in = new Scanner(System.in);
//        for (int i = 0; i < 5 ; i++) {
//            System.out.println("Введите строку");
//            String string = in.nextLine();
//            list.add(string);
//        }

        System.out.println(list);

        ListIterator<String> listIterator = list.listIterator();

        while(listIterator.hasNext()){
            String s = listIterator.next();
            listIterator.add(s);
        }

//        for (int i = list.size(); i > 0; i--) {
//            list.add(i, list.get(i - 1));
//        }

        System.out.println(list);

        for (String listTmp : list) {
            System.out.println(listTmp);
        }
    }
}
