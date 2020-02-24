package ClassRoom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pupil [] pupils = new Pupil[3];
        pupils[0] = new ExcellentPupil();
        pupils[1] = new GoodPupil();
        pupils[2] = new BadPupil();

        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер классной комнаты");
        int num = in.nextInt();

        switch (num){
            case 1:
                ClassRoom classRoom1 = new ClassRoom();
                break;
            case 2:
                ClassRoom classRoom2 = new ClassRoom(pupils[0]);
                break;
            case 3:
                ClassRoom classRoom3 = new ClassRoom(pupils[0],pupils[1]);
                break;
            case 4:
                ClassRoom classRoom4 = new ClassRoom(pupils[0],pupils[1],pupils[2]);
                break;
            case 5:
                ClassRoom classRoom5 = new ClassRoom(pupils[0],pupils[1],pupils[2],pupils[1]);
                break;
            default:
                System.out.println("No such classroom");
        }
    }
}