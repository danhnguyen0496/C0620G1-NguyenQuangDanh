package bai_17_io_binary_file_serialiazation.bai_tap.product_management_save_binary_file;

import java.io.Serializable;

public class ProductCSV implements Serializable {
    private int id;
    private String name;
    private String manufacturer;
    private float price;
    private String other;


    public ProductCSV() {
    }

    public ProductCSV(int id, String name, String manufacturer, float price, String other) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.other = other;
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "[" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", manufacturer = '" + manufacturer + '\'' +
                ", price = " + price +
                ", other = '" + other + '\'' +
                ']';
    }
}
