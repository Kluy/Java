package calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значения");
        String s = in.nextLine();
        String regex = ("(\\d*\\s?\\+?-?\\*?/?\\s?\\d*)*");
//        String regex2 = ("(\\+?-?\\s?\\d+\\s?-?\\+?)*");
        String[] arr = new String[]{};
        System.out.println(s.matches(regex));
        if (s.matches(regex)){
            arr = s.split(" ");
        }
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
                switch (arr[i]){
                    case "+":
                        if (i > 2){
                            a = a + Integer.parseInt(arr[i + 1]);
                        } else
                            a = Integer.parseInt(arr[i - 1]) + Integer.parseInt(arr[i + 1]);
                        System.out.println(a);
                    break;
                    case "-":
                        if (i > 2){
                            a = a - Integer.parseInt(arr[i + 1]);
                        } else
                            a = Integer.parseInt(arr[i - 1]) - Integer.parseInt(arr[i + 1]);
                        System.out.println(a);
                        break;
            }
        }
    }
}
