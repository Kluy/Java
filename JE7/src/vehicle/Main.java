package vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle.Wheel wheel = new Vehicle().new Wheel();
        Vehicle.Door door = new Vehicle().new Door();

        wheel.print();
        door.print();
    }
}
