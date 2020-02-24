package Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Player player = new Player();
        String operation;

        do {
            System.out.println("Выберите операцию");
            operation = in.next();
            switch (operation){
                case "stop":
                    player.stop();
                    break;
                case "play":
                    player.play();
                    break;
                case "pause":
                    player.pause();
                    break;
                case "record":
                    player.record();
                    break;
                case "exit":
                    System.out.println("Выход из программы");
                    break;
                default:
                    System.out.println("Нет такой функции");
            }
        }  while (!operation.equals("exit"));
    }
}