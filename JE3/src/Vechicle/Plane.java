package Vechicle;

public class Plane extends Vechicle {
    private int height;
    private int passengers;

    public Plane (int height, int passengers){
        System.out.println("Plane: " + getPrice() + "$ " + getSpeed() + "km/h " + getYear() + " " + height + "m " + passengers);
    }
}
