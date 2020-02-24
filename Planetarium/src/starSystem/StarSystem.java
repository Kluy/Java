package starSystem;

import java.util.ArrayList;

public class StarSystem{
    private String name;
    private ArrayList<Star> stars;
    private ArrayList<Planet> planets;

    public StarSystem(){}

    public StarSystem(String name, ArrayList<Star> stars, ArrayList<Planet> planets){
        this.name = name;
        this.stars = stars;
        this.planets = planets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Star> getStars() {
        return stars;
    }

    public void setStars(ArrayList<Star> stars) {
        this.stars = stars;
    }

    public ArrayList<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(ArrayList<Planet> planets) {
        this.planets = planets;
    }

    @Override
    public String toString() {
        return "StarSystem{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", planets=" + planets +
                '}';
    }
}
