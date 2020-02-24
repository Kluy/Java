package list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int)(1 + Math.random() * 10000));
        }

        System.out.println(list);

        ListIterator<Integer> iterator = list.listIterator();

        for (Integer integer : list) {
            System.out.println(integer);
        }

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}