package Car3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2001);
        Car car3 = new Car(2001, 260);
        Car car4 = new Car(2001, 260, 3300);
        Car car5 = new Car(2001, 260, 3300, "green");

        System.out.println("car1: " + car1.toString());
        System.out.println("car2: " + car2.toString());
        System.out.println("car3: " + car3.toString());
        System.out.println("car4: " + car4.toString());
        System.out.println("car5: " + car5.toString());
    }
}