package service;

import model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    public List<Product> getProducts(){
        List<Product> list = new ArrayList<>();
        list.add(new Product(1,"ball", 10));
        list.add(new Product(2,"plate", 12));
        list.add(new Product(3,"knife", 15));
        return list;
    }
}
