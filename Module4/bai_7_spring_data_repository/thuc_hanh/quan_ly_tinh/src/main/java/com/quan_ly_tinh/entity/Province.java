package com.quan_ly_tinh.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "province")
public class Province {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "province", cascade = CascadeType.ALL)
    private List<Customer> customerList;

    public Province() {
    }

    public Province(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}
