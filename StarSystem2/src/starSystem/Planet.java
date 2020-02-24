package starSystem;

import java.util.ArrayList;

public class Planet{
    private String name;
    private int weight;
    private ArrayList<Satellite> satellites;

    public Planet(){}

    public Planet(String name, int weight, ArrayList<Satellite> satellites) {
        this.name = name;
        this.weight = weight;
        this.satellites = satellites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public ArrayList<Satellite> getSatellites() {
        return satellites;
    }

    public void setSatellites(ArrayList<Satellite> satellites) {
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
