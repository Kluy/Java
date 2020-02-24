package movement;

import java.util.Scanner;

public class movement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        int y = 0;
        String command;

        Movement movement = null;

        do {
            System.out.println("Введите команду");
            command = in.nextLine();
            if (command.equals(movement.LEFT.toString())) {
                x--;
                System.out.println("x: " + x + " y: " + y);
            } else if (command.equals(movement.UP.toString())){
                y++;
                System.out.println("x: " + x + " y: " + y);
            } else if (command.equals(movement.RIGHT.toString())){
                x++;
                System.out.println("x: " + x + " y: " + y);
            } else if (command.equals(movement.DOWN.toString())) {
                y--;
                System.out.println("x: " + x + " y: " + y);
            }
        } while (!command.equals(movement.EXIT.toString()));
    }
    public enum Movement {
        LEFT()

        , RIGHT, UP, DOWN, EXIT
    }
}