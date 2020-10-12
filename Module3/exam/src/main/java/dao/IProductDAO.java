package dao;

import model.Product;

import java.util.List;

public interface IProductDAO {

    List<Product> findAll();

    String addNewProduct(Product product);

    List<Product> findByName(String name);

    String deleteById(String id);

//    List<Product> findByPrice(String price);

    String edit(String id, Product product);
}
