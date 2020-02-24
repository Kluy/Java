package car;

public class Main {
    public static void main(String[] args) {
        Wheel wheels = new Wheel(12);
        Wheel wheels1 = new Wheel(12);
        Engine engine = new Engine(2);
        Engine engine2 = new Engine(2);
        Car car = new Car("Mercedes");
        Car car1 = new Car("Mercedes");

        car.setWheels(wheels);
        car1.setWheels(wheels1);
        car.setEngine(engine);
        car1.setEngine(engine2);

        System.out.println(wheels.toString());


//        System.out.println(car.toString());
//        System.out.println(car1.toString());
//        car.toString();
//        car1.toString();
    }
}
