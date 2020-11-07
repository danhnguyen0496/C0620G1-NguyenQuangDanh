package com.project_furama.entity.contract;

import javax.persistence.*;
import java.util.List;

@Entity(name = "attach_service")
public class AttachService {

    @Id
    @Column(name = "attach_service_id")
    private String attachServiceId;
    @Column(name = "attach_service_name")
    private String attachServiceName;
    @Column(name = "attach_service_cost")
    private String attachServiceCost;
    @Column(name = "attach_service_unit")
    private String attachServiceUnit;
    @Column(name = "attach_service_status")
    private String attachServiceStatus;

    @OneToMany(mappedBy = "attachService", cascade = CascadeType.ALL)
    private List<ContractDetail> contractDetailList;

    public AttachService() {
    }

    public List<ContractDetail> getContractDetailList() {
        return contractDetailList;
    }

    public void setContractDetailList(List<ContractDetail> contractDetailList) {
        this.contractDetailList = contractDetailList;
    }

    public String getAttachServiceId() {
        return attachServiceId;
    }

    public void setAttachServiceId(String attachServiceId) {
        this.attachServiceId = attachServiceId;
    }

    public String getAttachServiceName() {
        return attachServiceName;
    }

    public void setAttachServiceName(String attachServiceName) {
        this.attachServiceName = attachServiceName;
    }

    public String getAttachServiceCost() {
        return attachServiceCost;
    }

    public void setAttachServiceCost(String attachServiceCost) {
        this.attachServiceCost = attachServiceCost;
    }

    public String getAttachServiceUnit() {
        return attachServiceUnit;
    }

    public void setAttachServiceUnit(String attachServiceUnit) {
        this.attachServiceUnit = attachServiceUnit;
    }

    public String getAttachServiceStatus() {
        return attachServiceStatus;
    }

    public void setAttachServiceStatus(String attachServiceStatus) {
        this.attachServiceStatus = attachServiceStatus;
    }
}
