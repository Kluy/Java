package Car;

public class Car {
    private int year;
    private String color;

    public Car () {
        year = 98;
        color = "blue";
        System.out.println(year + " " + color);
    };

    public Car (int year) {
        color = "blue";
        System.out.println(year + " " + color);
    };

    public Car (String color) {
        year = 98;
        System.out.println(year + " " + color);
    };

    public Car (int year, String color) {
        System.out.println(year + " " + color);
    };

}