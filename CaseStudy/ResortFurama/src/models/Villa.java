package models;

public class Villa extends Services {
    private String standardRoom;
    private String convenientDescription;
    private double areaPool;
    private int numberFloor;

    public Villa() {
    }

    public Villa(String id, String nameService, double areaUse, double rentCost, int maxNumberPeople,
                 String rentType, String standardRoom, String convenientDescription, double areaPool, int numberFloor) {
        super(id, nameService, areaUse, rentCost, maxNumberPeople, rentType);
        this.standardRoom = standardRoom;
        this.convenientDescription = convenientDescription;
        this.areaPool = areaPool;
        this.numberFloor = numberFloor;
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

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "id='" + id + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areaUse=" + areaUse +
                ", rentCost=" + rentCost +
                ", maxNumberPeople=" + maxNumberPeople +
                ", rentType='" + rentType + '\'' +
                ", standardRoom='" + standardRoom + '\'' +
                ", convenientDescription='" + convenientDescription + '\'' +
                ", areaPool=" + areaPool +
                ", numberFloor=" + numberFloor +
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println(this.toString());
    }
}
