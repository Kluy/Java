package Car4;

public class Car4 {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car4() {
        this(98, 200, 2500, "red");
    }

    public Car4(int year) {
        this(year, 200, 2500, "red");
    }

    public Car4(int year, double speed) {
        this(year, speed, 2500, "red");
    }

    public Car4(int year, double speed, int weight) {
        this(year, speed, weight, "red");
    }

    public Car4(int year, double speed, int weight, String color) {
        System.out.println(year + " " + speed + " " + weight + " " + color);
    }
}