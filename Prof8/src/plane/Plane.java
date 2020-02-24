package plane;

import java.io.Serializable;

public class Plane implements Serializable {
    private int age;
    private String name;
    private Engine engine;
    private Wings wings;
    private Chassis chassis;

    public Plane(int age, String name, Engine engine, Wings wings, Chassis chassis) {
        this.age = age;
        this.name = name;
        this.engine = engine;
        this.wings = wings;
        this.chassis = chassis;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wings getWings() {
        return wings;
    }

    public void setWings(Wings wings) {
        this.wings = wings;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", engine=" + engine +
                ", wings=" + wings +
                ", chassis=" + chassis +
                '}';
    }
}
