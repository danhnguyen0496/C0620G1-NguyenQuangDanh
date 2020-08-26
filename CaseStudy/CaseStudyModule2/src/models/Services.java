package models;

public abstract class Services {
    public String id;
    public String serviceName;
    public float areaUse;
    public float rentalCosts;
    public int maxAmountPeople;
    public String rentalType;

    public Services() {
    }

    public Services(String id, String serviceName, float areaUse, float rentalCosts, int maxAmountPeople, String rentalType) {
        this.id = id;
        this.serviceName = serviceName;
        this.areaUse = areaUse;
        this.rentalCosts = rentalCosts;
        this.maxAmountPeople = maxAmountPeople;
        this.rentalType = rentalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public float getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(float areaUse) {
        this.areaUse = areaUse;
    }

    public float getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(float rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaxAmountPeople() {
        return maxAmountPeople;
    }

    public void setMaxAmountPeople(int maxAmountPeople) {
        this.maxAmountPeople = maxAmountPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    abstract void showInfo();
}
