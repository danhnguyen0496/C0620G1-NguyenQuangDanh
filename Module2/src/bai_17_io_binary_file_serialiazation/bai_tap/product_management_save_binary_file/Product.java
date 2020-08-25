package bai_17_io_binary_file_serialiazation.bai_tap.product_management_save_binary_file;

import java.io.Serializable;

public class Product implements Serializable {
    private int maSo;
    private String tenSP;
    private String hangSX;
    private float gia;

    @Override
    public String toString() {
        return "[" +
                "maSo = " + maSo +
                ", nameProduct = '" + tenSP + '\'' +
                ", hangSX = '" + hangSX + '\'' +
                ", price = " + gia +
                ']';
    }

    public Product(int maSo, String tenSP, String hangSX, float gia) {
        this.maSo = maSo;
        this.tenSP = tenSP;
        this.hangSX = hangSX;
        this.gia = gia;

    }

    public Product() {
    }

    public int getMaSo() {
        return maSo;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

}
