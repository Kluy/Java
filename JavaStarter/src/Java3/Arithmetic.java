package Java3;

public class Arithmetic {
    public static void main(String[] args) {
        byte a = 30;
        byte b = 4;
        int c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0;
        c = (byte)(a + b);
        d = (byte)(a - b);
        e = (byte)(a * b);
        f = (byte)(a/b);
        g = (byte)(a%b);
        h = (byte)Math.pow(a,b);
        i = (byte)Math.sqrt(b);
        System.out.println(c + ", " + d + ", " + e + ", " + f + ", " + g + ", " + h + ", " + i);
    }
}
