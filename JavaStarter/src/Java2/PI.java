package Java2;

public class PI {
    public static void main(String[] args) {
        final double PI = 3.141592653, E = 2.7182818284590452;
        System.out.printf("E = %1$.16f, \nPI = %2$.9f",E, PI);
        System.out.printf("\nPI = %2$014.9f, \nE = %1$+025.16f", E, PI);
    }
}
