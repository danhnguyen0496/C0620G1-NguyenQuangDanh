package product_management.modules;

public class ExportProducts extends Product {
    private double priceExportProduct;
    private String countryExportProduct;

    public ExportProducts() {
    }

    public ExportProducts(int id, String codeProduct, String nameProduct, double priceProduct, int quantityProduct,
                          String manufacturer, double priceExportProduct, String countryExportProduct) {
        super(id, codeProduct, nameProduct, priceProduct, quantityProduct, manufacturer);
        this.priceExportProduct = priceExportProduct;
        this.countryExportProduct = countryExportProduct;
    }

    public double getPriceExportProduct() {
        return priceExportProduct;
    }

    public void setPriceExportProduct(double priceExportProduct) {
        this.priceExportProduct = priceExportProduct;
    }

    public String getCountryExportProduct() {
        return countryExportProduct;
    }

    public void setCountryExportProduct(String countryExportProduct) {
        this.countryExportProduct = countryExportProduct;
    }

    @Override
    public String toString() {
        return "ExportProducts{" +
                "id=" + id +
                ", codeProduct='" + codeProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", priceProduct=" + priceProduct +
                ", quantityProduct=" + quantityProduct +
                ", manufacturer='" + manufacturer + '\'' +
                ", priceExportProduct=" + priceExportProduct +
                ", countryExportProduct='" + countryExportProduct + '\'' +
                '}';
    }
}
