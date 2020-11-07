package com.project_furama.entity.service;

import com.project_furama.entity.contract.Contract;

import javax.persistence.*;
import java.util.List;

@Entity(name = "service")
public class Service {

    @Id
    @Column(name = "service_id")
    protected String id;
    @Column(name = "service_name")
    protected String serviceName;
    @Column(name = "service_area")
    protected String serviceArea;
    @Column(name = "service_cost")
    protected String serviceCost;
    @Column(name = "service_max_people")
    protected String serviceMaxPeople;

    @Column(name = "standard_room")
    protected String standardRoom;
    @Column(name = "description_other_convenience")
    protected String descriptionOtherConvenience;
    @Column(name = "pool_area")
    protected String poolArea;
    @Column(name = "number_of_floors")
    protected String numberOfFloors;

    @ManyToOne
    @JoinColumn(name = "service_type_id", referencedColumnName = "service_type_id")
    private ServiceType serviceType;

    @ManyToOne
    @JoinColumn(name = "rent_type_id", referencedColumnName = "rent_type_id")
    private RentType rentType;

    @OneToMany(mappedBy = "service", cascade = CascadeType.ALL)
    private List<Contract> contractList;

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }

    public Service() {
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
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

    public String getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }

    public String getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(String serviceCost) {
        this.serviceCost = serviceCost;
    }

    public String getServiceMaxPeople() {
        return serviceMaxPeople;
    }

    public void setServiceMaxPeople(String serviceMaxPeople) {
        this.serviceMaxPeople = serviceMaxPeople;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

}
