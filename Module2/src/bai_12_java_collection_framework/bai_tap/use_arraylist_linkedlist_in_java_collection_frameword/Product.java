package bai_12_java_collection_framework.bai_tap.use_arraylist_linkedlist_in_java_collection_frameword;

public class Product{
    private int id;
    private String nameProduct;
    private double cost;

    public Product() {
    }

    public Product(int id, String nameProduct, double cost) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "[" +
                "Id = " + id +
                ", Name = '" + nameProduct + '\'' +
                ", Cost = " + cost +
                ']';
    }
}
