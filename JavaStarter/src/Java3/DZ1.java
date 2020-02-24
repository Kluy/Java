package Java3;

public class DZ1 {
    public static void main(String[] args) {
        {
            int x = 10, y = 12, z = 3;  // Множественное объявление переменных
            x += y - x++ * z;
            System.out.println("x = " + x);
        }
        {
            int x = 10, y = 12, z = 3;
            z = --x - y * 5;
            System.out.println("z = " + z);
        }
        {
            int x = 10, y = 12, z = 3;
            y /= x + 5 % z;
            System.out.println("y = " + y);
        }
        {
            int x = 10, y = 12, z = 3;
            z = x++ + y * 5;
            System.out.println("z = " + z);
        }
        {
            int x = 10, y = 12, z = 3;
            x = y - x++ * z;
            System.out.println("x = " + x);
        }
    }
}