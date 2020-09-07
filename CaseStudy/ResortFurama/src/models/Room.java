package models;

public class Room extends Services {
    private ExtraServices extraServices;

    public Room(String id, String nameService, double areaUse, double rentCost, int maxNumberPeople,
                String rentType, ExtraServices extraServices) {
        super(id, nameService, areaUse, rentCost, maxNumberPeople, rentType);
        this.extraServices = extraServices;
    }

    public Room() {
    }

    public ExtraServices getExtraServices() {
        return extraServices;
    }

    public void setExtraServices(ExtraServices extraServices) {
        this.extraServices = extraServices;
    }

    @Override
    public String toString() {
        return "Room{" +
                ", id='" + id + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areaUse=" + areaUse +
                ", rentCost=" + rentCost +
                ", maxNumberPeople=" + maxNumberPeople +
                ", rentType='" + rentType + '\'' +
                "extraServices=" + extraServices +
                '}';
    }

    @Override
    public String showInfo() {
        return this.toString();
    }

}
