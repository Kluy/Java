package hashtable;

import java.util.Objects;

public class Bucket<T1,T2>{
    private T1 a;
    private T2 b;

    public Bucket(T1 a, T2 b) {
        this.a = a;
        this.b = b;
    }

    public T1 getA() {
        return a;
    }

    public void setA(T1 a) {
        this.a = a;
    }

    public T2 getB() {
        return b;
    }

    public void setB(T2 b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bucket)) return false;
        Bucket<?, ?> bucket = (Bucket<?, ?>) o;
        return Objects.equals(a, bucket.a) &&
                Objects.equals(b, bucket.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
