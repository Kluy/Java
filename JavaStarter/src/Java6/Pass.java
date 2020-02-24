package Java6;

import java.util.Scanner;

public class Pass {
    public static void main(String[] args) {
        String user = "Andrey";
        String password = "1";
        for (int i = 0; i < 3; i++) {
            Scanner inpt = new Scanner(System.in);
            System.out.println("Введите login");
            String login = inpt.nextLine();
            if (!user.equals(login)) {
                System.out.println("Login incorrect!");
            } else {
                for (int j = 0; j < 3; j++) {
                    System.out.println("Введите пароль");
                    String pass = inpt.nextLine();
                    if (!password.equals(pass)) {
                        System.out.println("Password incorrect!");
                    } else {
                        System.out.println("Привет!");
                        break;
                    }
                }
                break;
            }
        }
    }
}
