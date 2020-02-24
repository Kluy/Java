package box;

public class Box <T1 extends Number,T2> {
    private T1 num;
    private T2 type;

    public Box(T1 num, T2 type) {
        this.num = num;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Box{" +
                "num=" + num +
                ", type=" + type +
                '}';
    }
}
