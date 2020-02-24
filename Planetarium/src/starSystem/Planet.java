package starSystem;

import java.util.ArrayList;

public class Planet{
    private String name;
    private int weight;
    private ArrayList<Satellite> satellites;

    public Planet(){}

    public Planet(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Planet(String name, int weight, ArrayList<Satellite> satellites) {
        this.name = name;
        this.weight = weight;
        this.satellites = satellites;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", satellites=" + satellites +
                '}';
    }
}
