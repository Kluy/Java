package zooclub;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Person, List<Animal>> map = new HashMap<>();
        ZooClub zooClub = new ZooClub(map);
        Person person;

        Scanner in = new Scanner(System.in);
        int end = 1;
        do {
            System.out.println("Добавить участника клуба, нажмите 1\n" +
                    "Добавить или удалить животное у участника клуба, нажмите 2\n" +
                    "Удалить участника клуба, нажмите 3\n" +
                    "Удалить животное у всех участников, нажмите 4\n" +
                    "Вывести информацию о зооклубе, нажмите 5\n" +
                    "Выйти из программы, нажмите 0\n");
            int input = in.nextInt();
            in.nextLine();
                    switch (input){
                        case 1:
                            System.out.println("Введите имя участника клуба");
                            person = new Person(in.nextLine());
                            List<Animal> personalAnimals = new ArrayList<>();
                            String yesNo;
                            do{
                                System.out.println("Добавить животное: y/n");
                                yesNo = in.nextLine();
                                if (yesNo.equals("y")){
                                    System.out.println("Введите имя и вид животного");
                                    personalAnimals.add(new Animal(in.nextLine(),in.nextLine()));
                                }
                                } while (yesNo.equals("y"));
                            map.put(person, personalAnimals);
                            break;
                        case 2:
                            System.out.println("Введите имя участника");
                            String member = in.nextLine();
                            boolean exit = true;
                            while (exit) {
                                System.out.println(map.get(new Person(member)));
                                personalAnimals = map.get(new Person(member));
                                System.out.println("Добавить животное нажмите 1\n" +
                                        "Удалить животное, нажмите 2\n" +
                                        "Удалить всех животных, нажмите 3\n" +
                                        "Вернуться в главное меню, нажмите 0");
                                int num = in.nextInt();
                                in.nextLine();
                                switch (num) {
                                    case 1:
                                        System.out.println("Введите имя и тип животного");
                                        personalAnimals.add(new Animal(in.nextLine(), in.nextLine()));
                                        break;
                                    case 2:
                                        System.out.println("Введите имя и тип животного");
                                        personalAnimals.remove(new Animal(in.nextLine(), in.nextLine()));
                                        break;
                                    case 3:
                                        personalAnimals.clear();
                                        break;
                                    case 0:
                                        exit = false;
                                        break;
                                }
                            }
                            break;
                        case 3:
                            System.out.println("Введите имя участника которого вы хотите удалить");
                            String name = in.nextLine();
                            if(map.remove(new Person(name)) == null)
                                System.out.println("Нет такого участника\n");
                            else
                                map.remove(new Person(name));
                            break;
                        case 4:
                            System.out.println("Введите тип животного которое вы хотите удалить у всех участников");
                            String animalType = in.nextLine();
                            Iterator<List<Animal>> iterator = map.values().iterator();
                            while(iterator.hasNext()){
                                List<Animal> animal = iterator.next();
                                for(int i = animal.size() - 1; i >= 0; i--){
                                    if (animalType.equals(animal.get(i).getType())){
                                        animal.remove(i);
                                    }
                                }
                            }
                            break;
                        case 5:
                            System.out.println(zooClub);
                            break;
                        case 0:
                            end = input;
                            break;
                    }
        } while (end != 0);
    }
}
