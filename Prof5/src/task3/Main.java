package task3;

public class Main {
    public static void main(String[] args) {
        String str = "On this document we will be showing a java example on how to use the replace() method of HashMap Class." +
                " Basically this method is being used to insert a new a new key-value mapping to the hashmap object." +
                " The replace method is overloaded and we have two available method and here are the following.";
        System.out.println("Общая длина строки: " + str.length());
        System.out.println("Строка 1 : " + str.substring(0, str.length() / 2));
        System.out.println("Строка 2 : " + str.substring(str.length() / 2));
        System.out.println("Длина строки 1: " + str.substring(0, str.length() / 2).length());
        System.out.println("Длина строки 2: " + str.substring(str.length() / 2).length());
    }
}
