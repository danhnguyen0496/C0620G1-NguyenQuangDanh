package bai_17_io_binary_file_serialiazation.bai_tap.product_management_save_binary_file;

import java.io.Serializable;

public class StockProduct implements Serializable {
    private int maSo;
    private String nameProduct;
    private String hangSX;
    private float price;

    @Override
    public String toString() {
        return "StockProduct{" +
                "maSo=" + maSo +
                ", nameProduct='" + nameProduct + '\'' +
                ", hangSX='" + hangSX + '\'' +
                ", price=" + price +
                '}';
    }

    public StockProduct(int maSo, String nameProduct, String hangSX, float price) {
        this.maSo = maSo;
        this.nameProduct = nameProduct;
        this.hangSX = hangSX;
        this.price = price;

    }

    public StockProduct() {
    }

    public int getMaSo() {
        return maSo;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
