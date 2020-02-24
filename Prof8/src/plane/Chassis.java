package plane;

import java.io.Serializable;

public class Chassis implements Serializable {
    private int quantity;

    public Chassis(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Chassis{" +
                "quantity=" + quantity +
                '}';
    }
}
