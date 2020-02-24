package main;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> intList = new ArrayList<>();
        intList.add(3);
        intList.add(7);
        intList.add(8);

        ListIterator <Integer> iterator = intList.listIterator();
        int i = 0;
        while (iterator.hasNext()){
            Integer integer = iterator.next() + 1;
            intList.set(i,integer);
            i++;
            System.out.println(integer);
        }
        System.out.println(intList);
    }
}