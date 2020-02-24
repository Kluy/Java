import java.util.InputMismatchException;
import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
            boolean badInput = true;
            Scanner input = new Scanner(System.in);
            do {
                try {
                    System.out.println("Введите позитивное число");
                    int next = input.nextInt();
                    if (next > 0) {
                        badInput = false;
                    } else throw new InputMismatchException();
                } catch (InputMismatchException e) {
                    System.out.println("Please input a positive whole number.");
                }
                input.nextLine();
            } while (badInput);
        }
    }