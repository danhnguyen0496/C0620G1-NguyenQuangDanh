package bo;

import model.Product;

import java.util.List;

public interface ProductService {

    // Trả về danh sách tất cả sản phẩm
    List<Product> findAll();

    // Lưu một sản phẩm
    void save(Product product);

    // Tìm một sản phẩm theo Id
    Product findById(int id);

    // Cập nhật thông tin của một sản phẩm
    void update(int id, Product product);

    // Xoá một sản phẩm khỏi danh sách
    void remove(int id);

    // Tìm kiếm sản phẩm theo tên
    Product findByName(String name);
}
