package bo;

import model.Product;

import java.util.List;

public interface IProductBO {


    List<Product> findAll();

    String addNewProduct(Product product);

    List<Product> findByName(String name);

    String deleteById(String id);

    String edit(String id, Product product);

}
