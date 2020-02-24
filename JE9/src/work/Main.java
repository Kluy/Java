package work;

import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Worker[] worker = new Worker[3];
        int year;
        for (int i = 0; i < worker.length; i++) {
            worker[i] = new Worker();
            System.out.println("Введите фамилию и инициалы");
            worker[i].setName(in.nextLine());
            System.out.println("Введите должность");
            worker[i].setJob(in.nextLine());
            boolean input = true;
            System.out.println("Введите год поступления на службу");
            do {
                try {
                    year = in.nextInt();
                    in.nextLine();
                    if ((String.valueOf(Math.abs(year)).length() != 4)){
                        throw new Exception("Введите год в формате из четырех цифр");
                    } else {
                        worker[i].setYear(year);
                        input = false;
                    }
                } catch (InputMismatchException e){
                    in.nextLine();
                    System.out.println(e + "\nВведите цифры");
                } catch (Exception e){
                    System.out.println(e.getMessage());
                }
            } while (input);
        }

        for (Worker workerNew : worker) {
            System.out.println(workerNew);
        }

        Arrays.sort(worker, new Comparator<Worker>() {   // Сравнение по компаратору анонимному
            @Override
            public int compare(Worker o1, Worker o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });

        for (Worker workerNew : worker) {
            System.out.println(workerNew);
        }

        Arrays.sort(worker, new ComparatorByName()); // Сравнение по компаратору

        for (Worker workerNew : worker) {
            System.out.println(workerNew);
        }
    }
}
