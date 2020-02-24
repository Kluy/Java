package Java3;

public class DZ1_1 {
    public static void main(String[] args) {
        int x = 10, y = 12, z = 3;  // Множественное объявление переменных
        x += y - x++ * z;
        System.out.println(x + ", " + y + ", " + z);
        z = --x - y * 5;
        System.out.println(x + ", " + y + ", " + z);
        y /= x + 5 % z;
        System.out.println(x + ", " + y + ", " + z);
        z = x++ + y * 5;
        System.out.println(x + ", " + y + ", " + z);
        x = y - x++ * z;
        System.out.println(x + ", " + y + ", " + z);
    }
}