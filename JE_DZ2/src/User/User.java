package User;

public class User {
    private String name;
    private String lastName;
    private int age;
    private String email;

    public User () {
        this.name = "Andrey";
        this.lastName = "Kluy";
        this.age = 19;
        this.email = "kluy@i.ua";
        System.out.println(name + " " + lastName + " " + age + " " + email);
    }

    public User (String name, String lastName, int age){
//        this(name, lastName, age, "none");
        this.email = "none";
        System.out.println(name + " " + lastName + " " + age + " " + email);
    }

    public User (String name, String lastName, String email){
//        this(name, lastName, 12, email);
        this.age = 12;
        System.out.println(name + " " + lastName + " " + age + " " + email);
    }

    public User (String name, String lastName){
//        this(name, lastName, 12, "none");
        this.age = 12;
        this.email = "none";
        System.out.println(name + " " + lastName + " " + age + " " + email);
    }

    public User (String name, String lastName, int age, String email){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        System.out.println(name + " " + lastName + " " + age + " " + email);
    }
}