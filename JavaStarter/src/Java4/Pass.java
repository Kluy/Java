package Java4;

import java.util.Scanner;

public class Pass {
    public static void main(String[] args) {
                String user = "Andrey";
                String password = "1";
                Scanner inpt = new Scanner(System.in);
                System.out.println("Введите login");
                String login = inpt.nextLine();
                if (user.equals(login)) {
                    System.out.println("Введите пароль");
                    String pass = inpt.nextLine();
                    if (password.equals(pass)) {
                        System.out.println("Привет, Андрей!");
                    } else {
                        System.out.println("Password incorrect!");
                    }
        } else {
            System.out.println("Login incorrect!");
        }
    }
}
