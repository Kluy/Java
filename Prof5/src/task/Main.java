package task;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String str = "On this document we will be showing a java example on how to use the replace() method of HashMap Class." +
                " Basically this method is being used to insert a new a new key-value mapping to the hashmap object." +
                " The replace method is overloaded and we have two available method and here are the following.";

        String[] strSplit = str.split("\\.");

        Arrays.sort(strSplit, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        for (int i = 0; i < strSplit.length; i++) {
            System.out.println(strSplit[i].length());
            System.out.println(strSplit[i]);
        }
    }
}
