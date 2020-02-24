package dao;

import entities.Laptops;

import java.util.List;

public interface LaptopsDao {

        void add(Laptops laptops);
        void upate(Laptops laptops);
        Laptops get(int id);
        Laptops getModel(int id);
        List<Laptops> getAll();
        void close ();

}
