package models;

public class House extends Services {
    private String standardRoom;
    private String convenientDescription;
    private int numberFloor;

    public House(String id, String nameService, double areaUse, double rentCost, int maxNumberPeople, String rentType,
                 String standardRoom, String convenientDescription, int numberFloor) {
        super(id, nameService, areaUse, rentCost, maxNumberPeople, rentType);
        this.standardRoom = standardRoom;
        this.convenientDescription = convenientDescription;
        this.numberFloor = numberFloor;
    }

    public House() {
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getConvenientDescription() {
        return convenientDescription;
    }

    public void setConvenientDescription(String convenientDescription) {
        this.convenientDescription = convenientDescription;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "House{" +
                ", id='" + id + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areaUse=" + areaUse +
                ", rentCost=" + rentCost +
                ", maxNumberPeople=" + maxNumberPeople +
                ", rentType='" + rentType + '\'' +
                "standardRoom='" + standardRoom + '\'' +
                ", convenientDescription='" + convenientDescription + '\'' +
                ", numberFloor=" + numberFloor +
                '}';
    }

    @Override
    public String showInfo() {
        return this.toString();
    }
}
