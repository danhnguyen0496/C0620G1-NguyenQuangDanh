package models;

public class ImportedProducts extends Product {
    private double priceImportedProduct;
    private String provinceImportedProduct;
    private double taxImportedProduct;

    public ImportedProducts() {
    }

    public ImportedProducts(int id, String codeProduct, String nameProduct, double priceProduct, int quantityProduct,
                            String manufacturer, double priceImportedProduct, String provinceImportedProduct, double taxImportedProduct) {
        super(id, codeProduct, nameProduct, priceProduct, quantityProduct, manufacturer);
        this.priceImportedProduct = priceImportedProduct;
        this.provinceImportedProduct = provinceImportedProduct;
        this.taxImportedProduct = taxImportedProduct;
    }

    public double getPriceImportedProduct() {
        return priceImportedProduct;
    }

    public void setPriceImportedProduct(double priceImportedProduct) {
        this.priceImportedProduct = priceImportedProduct;
    }

    public String getProvinceImportedProduct() {
        return provinceImportedProduct;
    }

    public void setProvinceImportedProduct(String provinceImportedProduct) {
        this.provinceImportedProduct = provinceImportedProduct;
    }

    public double getTaxImportedProduct() {
        return taxImportedProduct;
    }

    public void setTaxImportedProduct(double taxImportedProduct) {
        this.taxImportedProduct = taxImportedProduct;
    }

    @Override
    public String toString() {
        return "ImportedProducts{" +
                super.toString() +
                ", priceImportedProduct=" + priceImportedProduct +
                ", provinceImportedProduct='" + provinceImportedProduct + '\'' +
                ", taxImportedProduct=" + taxImportedProduct +
                '}';
    }

    @Override
    public void showInfo() {

    }
}
