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
        if (!Validate.isValidQuantity(product.getProductQuantity())) {
            message = "Vui lòng nhập số lượng là một số nguyên dương";}
        else if (Validate.isValidPrice(product.getProductPrice())){
            message = "Vui lòng nhập giá là một số nguyên dương và phải lớn hơn 10.000.000 VND";
        }
        else {
            message = productDAO.addNewProduct(product);
        }
        return message;
    }

    @Override
    public List<Product> findByName(String name) {
        return this.productDAO.findByName(name);
    }

//    @Override
//    public List<Product> findByPrice(String price) {
//        return this.productDAO.findByPrice(price);
//    }

    @Override
    public String deleteById(String id) {
        return this.productDAO.deleteById(id);
    }

    @Override
    public String edit(String id, Product product) {
        return this.productDAO.edit(id, product);
    }
}
