package models;

public class ExtraServices {
    private String nameExtraServices;
    private String unit;
    private double price;

    public ExtraServices(String nameExtraServices, String unit, double price) {
        this.nameExtraServices = nameExtraServices;
        this.unit = unit;
        this.price = price;
    }

    public ExtraServices() {
    }

    public String getNameExtraServices() {
        return nameExtraServices;
    }

    public void setNameExtraServices(String nameExtraServices) {
        this.nameExtraServices = nameExtraServices;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ExtraServices{" +
                "nameExtraServices='" + nameExtraServices + '\'' +
                ", unit='" + unit + '\'' +
                ", price=" + price +
                '}';
    }
}
