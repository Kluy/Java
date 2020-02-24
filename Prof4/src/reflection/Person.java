package reflection;

public class Person {
    private int id;
    public int id2;
    private String name = "Толя";
    private String name2 = "Коля";
    protected String lastName;
    int age;

    public Person (){

    }

    public void hello(){
        System.out.println("Hello!");
    }

    public void hello2(){
        System.out.println("Hello2!");
    }

    public Person(int id) {
        this.id = id;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public Person(int id, String name, String lastName, int age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
}
