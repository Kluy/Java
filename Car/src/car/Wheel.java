package car;

public class Wheel {
    private int radius;

    public Wheel(int radius) {
        this.radius = radius;
//        System.out.println(radius);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "radius=" + radius +
                '}';
    }
}
