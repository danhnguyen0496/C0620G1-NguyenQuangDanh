package entity;

public class Product {
    private int id;
    private String name;
    private String price;
    private String typeProduct;

    public Product() {
    }

    public Product(int id, String name, String price, String typeProduct) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.typeProduct = typeProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(String typeProduct) {
        this.typeProduct = typeProduct;
    }
}
