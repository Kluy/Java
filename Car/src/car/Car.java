package car;

import java.util.Objects;

public class Car {
    private String type;
    private Engine engine;
    private Wheel wheels;

    public Car(String type) {
        this.type = type;
    }

//    public Car(Wheel wheels, Engine engine) {
//        this.wheels = wheels;
//        this.engine = engine;
//        System.out.println(wheels + " " + engine);
//    }

    public static void move(){

    }
    public static void tank(){

    }
    public static void changeWheel(Wheel wheels){

    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheels() {
        return wheels;
    }

    public void setWheels(Wheel wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(engine, car.engine) &&
                Objects.equals(wheels, car.wheels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, wheels);
    }
}