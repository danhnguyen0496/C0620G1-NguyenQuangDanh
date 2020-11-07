package com.project_furama.entity.customer;

import com.project_furama.entity.contract.Contract;

import javax.persistence.*;
import java.util.List;

@Entity(name = "customer")
public class Customer {

    @Id
    @Column(name = "customer_id")
    protected String id;
    @Column(name = "customer_name")
    protected String customerName;
    @Column(name = "customer_birthday")
    protected String customerBirthday;
    @Column(name = "customer_gender")
    protected String customerGender;
    @Column(name = "customer_id_card")
    protected String customerIdCard;
    @Column(name = "customer_phone")
    protected String customerPhone;
    @Column(name = "customer_email")
    protected String customerEmail;
    @Column(name = "customer_address")
    protected String customerAddress;

    @ManyToOne
    @JoinColumn(name = "customer_type_id", referencedColumnName = "customer_type_id")
    private TypeCustomer typeCustomer;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Contract> contractList;

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }

    public Customer() {
    }

    public TypeCustomer getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(TypeCustomer typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerBirthday() {
        return customerBirthday;
    }

    public void setCustomerBirthday(String customerBirthday) {
        this.customerBirthday = customerBirthday;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
}
