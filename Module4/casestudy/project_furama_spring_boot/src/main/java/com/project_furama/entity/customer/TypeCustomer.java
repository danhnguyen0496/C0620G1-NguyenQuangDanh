package com.project_furama.entity.customer;

import javax.persistence.*;
import java.util.List;

@Entity(name = "customer_type")
public class TypeCustomer {

    @Id
    @Column(name = "customer_type_id")
    private String customerTypeId;
    @Column(name = "customer_type_name")
    private String customerTypeName;

    @OneToMany(mappedBy = "typeCustomer", cascade = CascadeType.ALL)
    private List<Customer> customerList;

    public TypeCustomer() {
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public TypeCustomer(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public String getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(String customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }
}
