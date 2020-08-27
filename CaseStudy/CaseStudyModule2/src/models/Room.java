package models;

import java.io.Serializable;

public class Room extends Services implements Serializable {
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
    String showInfo() {
        return ("Information Room: " + "\nId: " + super.getId() + "\nServiceName: " + super.getServiceName() +
                "+\nArea Use: " + super.getAreaUse() + "\nRentalCosts: " + super.getRentalCosts() +
                "\nMaxAmountPeople: " + super.getMaxAmountPeople() + "\nRentalType: " + super.getRentalType() +
                "\nFreeServiceIncluded: " + freeServiceIncluded);
    }
}
