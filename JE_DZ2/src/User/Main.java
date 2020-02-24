package User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = in.nextLine();

        System.out.println("Введите фамилию");
        String lastName = in.nextLine();

        System.out.println("Введите возраст");
        String age = in.nextLine();

        System.out.println("Введите емейл");
        String email = in.nextLine();

        if ((age.equals("") && email.equals("") && name.equals("") && lastName.equals(""))){
            User user = new User();
        } else if (age.equals("") && email.equals("")){
            User userName = new User(name, lastName);
        } else if (email.equals("")) {
            User userNoEmail = new User(name, lastName, Integer.parseInt(age));
        } else if (age.equals("")){
            User userNoAge = new User(name, lastName, email);
        } else {
            User userAll = new User(name, lastName, Integer.parseInt(age), email);
        }
    }
}