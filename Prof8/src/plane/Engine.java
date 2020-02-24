package plane;

import java.io.Serializable;

public class Engine implements Serializable {
    private int volume;
    private int power;

    public Engine(int volume, int power) {
        this.volume = volume;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", power=" + power +
                '}';
    }
}
