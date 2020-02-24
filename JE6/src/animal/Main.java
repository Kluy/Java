package animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Васька", 45, false);
        Animal animal2 = new Animal("Васька", 45, true);
        Animal animal3 = new Animal("Васька", 45, false);
        System.out.println(animal.hashCode());
        System.out.println(animal2.hashCode());
        System.out.println(animal3.hashCode());
        System.out.println(animal.equals(animal2));
        System.out.println(animal.equals(animal3));
    }
}
