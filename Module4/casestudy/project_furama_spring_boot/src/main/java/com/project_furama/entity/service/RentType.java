package com.project_furama.entity.service;

import javax.persistence.*;
import java.util.List;

@Entity(name = "rent_type")
public class RentType {
    @Id
    @Column(name = "rent_type_id")
    private String rentTypeId;
    @Column(name = "rent_type_name")
    private String rentTypeName;
    @Column(name = "rent_type_cost")
    private String rentTypeCost;

    @OneToMany(mappedBy = "rentType", cascade = CascadeType.ALL)
    private List<Service> serviceList;

    public List<Service> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<Service> serviceList) {
        this.serviceList = serviceList;
    }

    public RentType() {
    }

    public String getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(String rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public String getRentTypeName() {
        return rentTypeName;
    }

    public void setRentTypeName(String rentTypeName) {
        this.rentTypeName = rentTypeName;
    }

    public String getRentTypeCost() {
        return rentTypeCost;
    }

    public void setRentTypeCost(String rentTypeCost) {
        this.rentTypeCost = rentTypeCost;
    }
}
