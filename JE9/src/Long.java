
public class Long {
    public int getCountsOfDigits(long number) {
        int count = (number == 0) ? 1 : 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Long main = new Long();
        System.out.println(main.getCountsOfDigits(2004));
    }
}
