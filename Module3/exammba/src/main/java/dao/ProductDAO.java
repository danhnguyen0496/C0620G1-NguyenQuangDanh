package dao;

import model.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO implements IProductDAO {
    BaseDAO baseDAO = new BaseDAO();

    @Override
    public List<Product> findAll() {

        List<Product> productList = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().
                    prepareStatement("select product_id, product_name, product_price, product_quantity," +
                            " product_color, product_description, category_id from product");

            ResultSet rs = preparedStatement.executeQuery();

            Product product;
            while (rs.next()) {
                String productId = rs.getString("product_id");
                String productName = rs.getString("product_name");
                String productPrice = rs.getString("product_price");
                String productQuantity = rs.getString("product_quantity");
                String productColor = rs.getString("product_color");
                String productDescription = rs.getString("product_description");
                String categoryId = rs.getString("category_id");

                product = new Product(productId, productName, productPrice, productQuantity, productColor, productDescription, categoryId);
                productList.add(product);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return productList;
    }

    @Override
    public String addNewProduct(Product product) {
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().
                    prepareStatement("insert into product(product_id, product_name, product_price, product_quantity," +
                            "product_color, product_description, category_id) values (?, ?, ?, ?, ?, ?, ?);");

            preparedStatement.setString(1, product.getProductId());
            preparedStatement.setString(2, product.getProductName());
            preparedStatement.setString(3, product.getProductPrice());
            preparedStatement.setString(4, product.getProductQuantity());
            preparedStatement.setString(5, product.getProductColor());
            preparedStatement.setString(6, product.getProductDescription());
            preparedStatement.setString(7, product.getCategoryId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Add new successful";
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productList = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().
                    prepareStatement("select product_id, product_name, product_price, product_quantity," +
                            "product_color, product_description, category_id from product where product_name like ?");

            preparedStatement.setString(1, '%' + name + '%');
            ResultSet rs = preparedStatement.executeQuery();
            Product product;
            while (rs.next()) {
                String productId = rs.getString("product_id");
                String productName = rs.getString("product_name");
                String productPrice = rs.getString("product_price");
                String productQuantity = rs.getString("product_quantity");
                String productColor = rs.getString("product_color");
                String productDescription = rs.getString("product_description");
                String categoryId = rs.getString("category_id");

                product = new Product(productId, productName, productPrice, productQuantity, productColor, productDescription, categoryId);
                productList.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }

    @Override
    public String deleteById(String id) {

        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().
                    prepareStatement("delete from product where product_id = ?");
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Deleted successfully";
    }

    @Override
    public String edit(String id, Product product) {
        String query = "update product set product_name = ?, product_price = ?, product_quantity = ?, product_color = ?," +
                "product_description = ?, category_id= ? where product_id = ?;";
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().prepareStatement(query);
            preparedStatement.setString(1, product.getProductName());
            preparedStatement.setString(2, product.getProductPrice());
            preparedStatement.setString(3, product.getProductQuantity());
            preparedStatement.setString(4, product.getProductColor());
            preparedStatement.setString(5, product.getProductDescription());
            preparedStatement.setString(6, product.getCategoryId());
            preparedStatement.setString(7, product.getProductId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Edit successfully";
    }
}
