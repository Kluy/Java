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

        System.out.println("Введите колличество звезд вашей звездной ситемы");

        int number = in.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Введите название звезды №" + (i + 1));
            String starName = in.next();
            System.out.println("Введите тип звезды");
            String starType = in.next();
            star = new Star(starName, starType);
            stars.add(star);
        }

        System.out.println("Ведите колличество планет");

        number = in.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Введите название планеты №" + (i + 1));
            String planetName = in.next();
            System.out.println("Введите массу планеты");
            int planetWeight = in.nextInt();
            System.out.println("Ведите колличество спутников");
            int satNumber = in.nextInt();
            ArrayList<Satellite> satellites = new ArrayList<>();
            for (int j = 0; j < satNumber; j++) {
                System.out.println("Введите название спутникa №" + (j + 1));
                String satName = in.next();
                satellite = new Satellite(satName);
                satellites.add(satellite);
            }
            planet = new Planet(planetName, planetWeight, satellites);
            planets.add(planet);
        }

        starSystem = new StarSystem(starSystemName, stars, planets);

        System.out.println(starSystem.toString());
        System.out.println(starSystem.getPlanets());

        System.out.println("Вы создали звездную систему. Чтобы вывести информацию на экран введите 1");
        int num = in.nextInt();
        do {
            switch (num){
                case 1:
                    System.out.println("Вывести информацию о звезной системе нажмите 1");
                    System.out.println("Вывести информацию о звездах нажмите 2");
                    System.out.println("Вывести информацию о планетах нажмите 3");
                    System.out.println("Добавить планету нажмите 4");
                    System.out.println("Удалить планету нажмите 5");
                    System.out.println("Для выхода введите 0");
                    int input = in.nextInt();
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
                            String planetName = in.next();
                            System.out.println("Введите массу планеты");
                            int planetWeight = in.nextInt();
                            System.out.println("Ведите колличество спутников");
                            int satNumber = in.nextInt();
                            ArrayList<Satellite> satellites = new ArrayList<>();
                            for (int j = 0; j < satNumber; j++) {
                                System.out.println("Введите название спутникa №" + (j + 1));
                                String satName = in.next();
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
                            System.out.println(starSystem.getPlanets());
                            break;
                        case 0:
                            num = input;
                            break;
                    }
            }
        } while (num != 0);
    }
}