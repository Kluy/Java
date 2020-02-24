package task;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите логин и пароль");
        String login = in.nextLine(),
                password = in.nextLine();

        Pattern p1 = Pattern.compile("[a-zA-Z]*"),
                p2 = Pattern.compile("\\w*\\d*");
        Matcher m1 = p1.matcher(login),
                m2 = p2.matcher(password);
        boolean b1 = m1.matches(),
                b2 = m2.matches();
        System.out.println(b1 + "\n" + b2);
    }
}

