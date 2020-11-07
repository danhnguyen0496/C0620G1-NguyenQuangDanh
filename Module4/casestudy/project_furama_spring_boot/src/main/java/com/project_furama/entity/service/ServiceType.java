package com.project_furama.entity.service;

import javax.persistence.*;
import java.util.List;

@Entity(name = "service_type")
public class ServiceType {

    @Id
    @Column(name = "service_type_id")
    private String serviceTypeId;
    @Column(name = "service_type_name")
    private String serviceTypeName;

    @OneToMany(mappedBy = "serviceType", cascade = CascadeType.ALL)
    private List<Service> serviceList;

    public List<Service> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<Service> serviceList) {
        this.serviceList = serviceList;
    }

    public ServiceType() {
    }

    public String getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(String serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public String getServiceTypeName() {
        return serviceTypeName;
    }

    public void setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
    }
}
