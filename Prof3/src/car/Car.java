package car;

import java.util.Objects;

public class Car<T1 extends Integer, T2 extends Integer, T3 extends String> {
    private T1 price;
    private T2 weight;
    private T3 name;


    public Car(T1 price, T2 weight, T3 name) {
        this.price = price;
        this.weight = weight;
        this.name = name;
    }

    public T1 getPrice() {
        return price;
    }

    public T2 getWeight() {
        return weight;
    }

    public T3 getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", weight=" + weight +
                ", name=" + name +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car<?, ?, ?> car = (Car<?, ?, ?>) o;
        return Objects.equals(price, car.price) &&
                Objects.equals(weight, car.weight) &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, weight, name);
    }
}
