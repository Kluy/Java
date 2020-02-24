package plane;

import java.io.Serializable;

public class Wings implements Serializable {
    private int size;

    public Wings(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Wings{" +
                "size=" + size +
                '}';
    }
}
