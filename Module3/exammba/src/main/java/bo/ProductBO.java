package bo;

import common.Validate;
import dao.IProductDAO;
import dao.ProductDAO;
import model.Product;

import java.util.List;

public class ProductBO implements IProductBO {

    IProductDAO productDAO = new ProductDAO();

    @Override
    public List<Product> findAll() {
        return this.productDAO.findAll();
    }

    @Override
    public String addNewProduct(Product product) {
        String message = "";
        if (product.getProductName() == null || product.getProductName().equals("")) {
            message = "Please input name";
        } else if (!Validate.isValidName(product.getProductName())) {
            message = "Please do not input digit and special characters";
        } else {
            message = productDAO.addNewProduct(product);
        }
        return message;
    }

    @Override
    public List<Product> findByName(String name) {
        return this.productDAO.findByName(name);
    }

    @Override
    public String deleteById(String id) {
        return this.productDAO.deleteById(id);
    }

    @Override
    public String edit(String id, Product product) {
        return this.productDAO.edit(id, product);
    }
}
