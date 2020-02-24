package distance;

public class Distance {
    private double distance;
    private static final double miles;

    static {
        miles = 0.621371;
    }

    class Converter {

        public double print(double yourDistance) {
            distance = yourDistance * miles;
            return distance;
        }
    }
}
