package Java6;

import java.util.Scanner;

public class Pass2 {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        String user = "Andrey";
        String password = "1";
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите login");
            String login = inpt.nextLine();
            System.out.println("Введите пароль");
            String pass = inpt.nextLine();
            if (!user.equals(login) || !password.equals(pass)) {
                System.out.println("Login or password incorrect!");
            } else {
                System.out.println("Привет!");
                break;
            }
        }
    }
}
