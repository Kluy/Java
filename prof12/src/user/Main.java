package user;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Andrew", 28, "man"));
        users.add(new User("Alex", 20, "man"));
        users.add(new User("Dan", 12, "man"));
        users.add(new User("Kate", 20, "woman"));
        users.add(new User("Jane", 15, "woman"));

        System.out.println(users.stream().count());
        System.out.println();

        System.out.println(users.stream().findFirst().orElse(new User("no name", 0, "unknown")));
        System.out.println();

        users.stream().skip(users.size()-1).forEach(System.out::println);
        System.out.println();

        users.stream().skip(2).limit(1).forEach(System.out::println);
        System.out.println();

        users.stream().skip(1).limit(2).forEach(System.out::println);
        System.out.println();

        users.stream()
                .filter(user -> user.getAge() > 18 && user.getAge() < 27 && user.getGender().equals("man"))
                .forEach(System.out::println);
        System.out.println();
    }
}
