package util;

import dao.LaptopsDao;
import dao_impl.LaptopsDaoImpl;
import entities.Laptops;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LaptopsDao laptopsDao = new LaptopsDaoImpl();

        List<Laptops> laptops = laptopsDao.getAll();

        laptops.forEach(System.out::println);

        System.out.println("\nВведите id ноутбука");

        Scanner in = new Scanner(System.in);
        int id = in.nextInt();

        laptopsDao.get(id);

        //  Выбрать ноуты по id производителя

        System.out.println("\nВведите id производителя ноутбука\n" +
                "1. Dell\n" +
                "2. Apple\n" +
                "3. Asus\n" +
                "4. Lenovo\n" +
                "5. HP");

        int companyId = in.nextInt();

        laptopsDao.getModel(companyId);


         //  Уменьшить цену для на 1 если ноут Apple

        for (Laptops newList : laptops) {
            if(newList.getCompanyName().equals("Apple")){
                newList.setPrice(newList.getPrice() - 1);
                laptopsDao.upate(newList);
            }
        }

         // Добавить ноут

        laptopsDao.add(new Laptops("Asus Pro2", "3",
                300, 20, "2", "1",
                "3", "1", "4"));

        laptopsDao.close();
    }
}
