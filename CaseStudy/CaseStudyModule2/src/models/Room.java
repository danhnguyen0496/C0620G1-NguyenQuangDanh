package models;

public class Room extends Services {
    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public Room(String id, String serviceName, float areaUse, float rentalCosts,
                int maxAmountPeople, String rentalType, String freeServiceIncluded) {
        super(id, serviceName, areaUse, rentalCosts, maxAmountPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    void showInfo() {
        System.out.print("Information Room: " + "\nId: " + id + "\nServiceName: " + super.getServiceName() +
                "+\nArea Use: " + super.getAreaUse() + "\nRentalCosts: " + super.getRentalCosts() +
                "\nMaxAmountPeople: " + super.getMaxAmountPeople() + "\nRentalType: " + super.getRentalType() +
                "\nFreeServiceIncluded: " + freeServiceIncluded);
    }
}
