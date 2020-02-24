package Java4;

import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        Scanner inpt = new Scanner (System.in);
        System.out.println("Введите слово говорящее о погоде");
        String word =  inpt.nextLine();
        String w0 = "temperature",
               w1 = "cloud",
               w2 = "sky",
               w3 = "rain",
               w4 = "rainbow",
               w5 = "sun",
               w6 = "wind",
               w7 = "snow",
               w8 = "fog",
               w9 = "storm";
        switch (word) {
            case "температура":
                System.out.println(w0);
                break;
            case "облако":
                System.out.println(w1);
                break;
            case "небо":
                System.out.println(w2);
                break;
            case "дождь":
                System.out.println(w3);
                break;
            case "радуга":
                System.out.println(w4);
                break;
            case "солнце":
                System.out.println(w5);
                break;
            case "ветер":
                System.out.println(w6);
                break;
            case "снег":
                System.out.println(w7);
                break;
            case "туман":
                System.out.println(w8);
                break;
            case "шторм":
                System.out.println(w9);
                break;
        }
    }
}
