package models;

public abstract class Services {
    protected String id;
    protected String nameService;
    protected double areaUse;
    protected double rentCost;
    protected int maxNumberPeople;
    protected String rentType;

    public Services(String id, String nameService, double areaUse, double rentCost, int maxNumberPeople, String rentType) {
        this.id = id;
        this.nameService = nameService;
        this.areaUse = areaUse;
        this.rentCost = rentCost;
        this.maxNumberPeople = maxNumberPeople;
        this.rentType = rentType;
    }

    public Services() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(double areaUse) {
        this.areaUse = areaUse;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public int getMaxNumberPeople() {
        return maxNumberPeople;
    }

    public void setMaxNumberPeople(int maxNumberPeople) {
        this.maxNumberPeople = maxNumberPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "Services{" +
                "id='" + id + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areaUse=" + areaUse +
                ", rentCost=" + rentCost +
                ", maxNumberPeople=" + maxNumberPeople +
                ", rentType='" + rentType + '\'' +
                '}';
    }

    public abstract String showInfo();
}
