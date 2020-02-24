package dao;

import model.Product;

import java.util.List;

public interface ProductDao {
    List<Product> findAll();
    Product findById(int id);
    void add(Product product);
}
