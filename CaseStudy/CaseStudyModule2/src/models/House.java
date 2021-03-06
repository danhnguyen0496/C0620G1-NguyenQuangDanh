package models;

import java.io.Serializable;

public class House extends Services implements Serializable {
    private String standardRoom;
    private String describeAmenities;
    private int numberFloors;

    public House() {
    }

    public House(String standardRoom, String describeAmenities, int numberFloors) {
        this.standardRoom = standardRoom;
        this.describeAmenities = describeAmenities;
        this.numberFloors = numberFloors;
    }

    public House(String id, String serviceName, float areaUse, float rentalCosts, int maxAmountPeople,
                 String rentalType, String standardRoom, String describeAmenities, int numberFloors) {
        super(id, serviceName, areaUse, rentalCosts, maxAmountPeople, rentalType);
        this.standardRoom = standardRoom;
        this.describeAmenities = describeAmenities;
        this.numberFloors = numberFloors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescribeAmenities() {
        return describeAmenities;
    }

    public void setDescribeAmenities(String describeAmenities) {
        this.describeAmenities = describeAmenities;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    String showInfo() {
        return ("Information: " + " - Id: " + super.getId() + " - ServiceName: " + super.getServiceName() +
                " - Area Use: " + super.getAreaUse() + " - RentalCosts: " + super.getRentalCosts() +
                " - MaxAmountPeople: " + super.getMaxAmountPeople() + " - RentalType: " + super.getRentalType() +
                " - StandardRoom: " + standardRoom + " - Describe Amenities: " + describeAmenities +
                " - Number Floors: " + numberFloors);
    }
}
