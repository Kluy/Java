package starSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Star star;
        Planet planet;
        Satellite satellite;
        ArrayList<Star> stars = new ArrayList<>();
        ArrayList<Planet> planets = new ArrayList<>();
        StarSystem starSystem = new StarSystem();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название звездной системы");
        String starSystemName = in.nextLine();
        starSystem.setName(starSystemName);
        starSystem = new StarSystem(starSystemName, stars, planets);

        System.out.println("Вы ввели название звездой системы. Нажмите 1 чтобы добавить другие данные о системе");
        int num = in.nextInt();
        do {
            switch (num){
                case 1:
                    System.out.println("Вывести информацию о звезной системе нажмите 1");
                    System.out.println("Вывести информацию о звездах нажмите 2");
                    System.out.println("Вывести информацию о планетах нажмите 3");
                    System.out.println("Добавить планету нажмите 4");
                    System.out.println("Удалить планету нажмите 5");
                    System.out.println("Добавить звезду нажмите 6");
                    System.out.println("Удалить звезду нажмите 7");
                    System.out.println("Изменить название звездной системы нажмите 8");
                    System.out.println("Выбрать планету, нажмите 9");
                    System.out.println("Для выхода введите 0");
                    int input = in.nextInt();
                    in.nextLine();
                    switch (input){
                        case 1:
                            System.out.println(starSystem.toString());
                            break;
                        case 2:
                            System.out.println(starSystem.getStars());
                            break;
                        case 3:
                            System.out.println(starSystem.getPlanets());
                            break;
                        case 4:
                            System.out.println("Введите название планеты");
                            String planetName = in.nextLine();
                            System.out.println("Введите массу планеты");
                            int planetWeight = in.nextInt();
                            System.out.println("Ведите колличество спутников");
                            int satNumber = in.nextInt();
                            in.nextLine();
                            ArrayList<Satellite> satellites = new ArrayList<>();
                            for (int j = 0; j < satNumber; j++) {
                                System.out.println("Введите название спутникa №" + (j + 1));
                                String satName = in.nextLine();
                                satellite = new Satellite(satName);
                                satellites.add(satellite);
                            }
                            planet = new Planet(planetName, planetWeight, satellites);
                            planets.add(planet);
                            break;
                        case 5:
                            System.out.println("Введите индекс планеты");
                            int name = in.nextInt();
                            planets.remove(name);
                            break;
                        case 6:
                                System.out.println("Введите название звезды");
                                String starName = in.nextLine();
                                System.out.println("Введите тип звезды");
                                String starType = in.nextLine();
                                star = new Star(starName, starType);
                                stars.add(star);
                            break;
                        case 7:
                            System.out.println("Введите индекс звезды");
                            int name2 = in.nextInt();
                            planets.remove(name2);
                            break;
                        case 8:
                            System.out.println("Введите новое название звездной системы");
                            String inputName = in.nextLine();
                            starSystem.setName(inputName);
                            break;
                        case 9:
                            System.out.println("Введите индекс планеты");
                            int index = in.nextInt();
                            if (index > planets.size()){
                                System.out.println("Нет планеты с таким индексом");
                            } else {
                                Planet planetChoose = planets.get(index);
                                System.out.println(planetChoose.toString());
                            }
                            break;
                        case 0:
                            num = input;
                            break;
                    }
            }
        } while (num != 0);
    }
}