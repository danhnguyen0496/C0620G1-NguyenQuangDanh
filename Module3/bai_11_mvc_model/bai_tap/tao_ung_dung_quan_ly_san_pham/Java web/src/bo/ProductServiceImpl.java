package bo;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {

    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Táo", "10000", "Táo Ngon", "Công nghiệp táo"));
        products.put(2, new Product(2, "Chuối", "50000", "Chuối Dài", "Công nghiệp chuối"));
        products.put(3, new Product(3, "Hành", "20000", "Hành Xanh", "Công nghiệp hành"));
        products.put(4, new Product(4, "Bưởi", "90000", "Bưởi Ngọt", "Công nghiệp bưởi"));
        products.put(5, new Product(5, "Nho", "15000", "Nho Đen", "Công nghiệp nho"));
    }

    @Override

    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public Product findByName(String name) {
        return products.get(name);
    }
}
