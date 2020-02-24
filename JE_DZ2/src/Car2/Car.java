package Car2;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car () {
        this.year = 98;
        this.speed = 200;
        this.weight = 2500;
        this.color = "red";
        System.out.println(year + " " + speed + " " + weight + " " + color);
    }

    public Car (int year) {
        this.speed = 200;
        this.weight = 2500;
        this.color = "red";
        System.out.println(year + " " + speed + " " + weight + " " + color);
    }

    public Car (int year, double speed) {
        this.weight = 2500;
        this.color = "red";
        System.out.println(year + " " + speed + " " + weight + " " + color);
    }

    public Car (int year, double speed, int weight) {
        this.color = "red";
        System.out.println(year + " " + speed + " " + weight + " " + color);
    }

    public Car (int year, double speed, int weight, String color) {
        System.out.println(year + " " + speed + " " + weight + " " + color);
    }
}