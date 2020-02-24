package Vechicle;

public class Ship extends Vechicle {
    private String port;
    private int passengers;

    public Ship (String port, int passengers){
        System.out.println("Ship: " + getPrice() + "$ " + getSpeed() + "km/h " + getYear() + " " + port + " " + passengers);
    }
}
