package com.project_furama.entity.contract;

import com.project_furama.entity.customer.Customer;
import com.project_furama.entity.employee.Employee;
import com.project_furama.entity.service.Service;

import javax.persistence.*;
import java.util.List;

@Entity(name = "contract")
public class Contract {

    @Id
    @Column(name = "contract_id")
    private String contractId;
    @Column(name = "contract_start_date")
    private String contractStartDate;
    @Column(name = "contract_end_date")
    private String contractEndDate;
    @Column(name = "contract_deposite")
    private String contractDeposit;
    @Column(name = "contract_total_money")
    private String contractTotalMoney;

    @OneToMany(mappedBy = "contract", cascade = CascadeType.ALL)
    private List<ContractDetail> contractDetailList;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "service_id", referencedColumnName = "service_id")
    private Service service;

    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id")
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Contract() {
    }

    public List<ContractDetail> getContractDetailList() {
        return contractDetailList;
    }

    public void setContractDetailList(List<ContractDetail> contractDetailList) {
        this.contractDetailList = contractDetailList;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(String contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public String getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(String contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public String getContractDeposit() {
        return contractDeposit;
    }

    public void setContractDeposit(String contractDeposit) {
        this.contractDeposit = contractDeposit;
    }

    public String getContractTotalMoney() {
        return contractTotalMoney;
    }

    public void setContractTotalMoney(String contractTotalMoney) {
        this.contractTotalMoney = contractTotalMoney;
    }

}
