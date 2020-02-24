package Java3;

public class Volume {
    public static void main(String[] args) {
        int r = 3, h = 14;
        final float PI = 3.14f;
        final float V = PI * r * r * h;
        final float S = 2 * PI * r * (r + h);
        System.out.println(V + ", " + S);
    }
}
