package models;

import java.io.Serializable;

public class Villa extends Services implements Serializable {
    private String standardRoom;
    private String describeAmenities;
    private float swimmingPoolArea;
    private int numberFloors;

    public Villa() {
    }

    public Villa(String standardRoom, String describeAmenities, float swimmingPoolArea, int numberFloors) {
        this.standardRoom = standardRoom;
        this.describeAmenities = describeAmenities;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberFloors = numberFloors;
    }

    public Villa(String id, String serviceName, float areaUse, float rentalCosts,
                 int maxAmountPeople, String rentalType, String standardRoom,
                 String describeAmenities, float swimmingPoolArea, int numberFloors) {
        super(id, serviceName, areaUse, rentalCosts, maxAmountPeople, rentalType);
        this.standardRoom = standardRoom;
        this.describeAmenities = describeAmenities;
        this.swimmingPoolArea = swimmingPoolArea;
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

    public float getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(float swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    String showInfo() {
        return ("Information Villa: " + "\nId: " + super.getId() + "\nServiceName: " + super.getServiceName() +
                "\nArea Use: " + super.getAreaUse() + "\nRentalCosts: " + super.getRentalCosts() +
                "\nMaxAmountPeople: " + super.getMaxAmountPeople() + "\nRentalType: " + super.getRentalType() +
                "\nStandardRoom: " + standardRoom +
                "\nDescribe Amenities: " + describeAmenities + "\nSwimming Pool Area: " + swimmingPoolArea +
                "\nNumber Floors: " + numberFloors);
    }
}