package com.exam_exp.entity;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity(name = "customer")
public class Customer implements Validator {

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

    @Pattern(regexp = "^[A-Za-z0-9]+@[A-Za-z0-9]+.[A-Za-z0-9]+$",message = "Email must be in the correct format")
    @Column(name = "customer_email")
    protected String customerEmail;

    @Column(name = "customer_address")
    protected String customerAddress;

    @ManyToOne
    @JoinColumn(name = "customer_type_id", referencedColumnName = "customer_type_id")
    private TypeCustomer typeCustomer;

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

    // Custom Validate
    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        Customer customer = (Customer) target;

        String id = customer.getId();
        String customerIdCard = customer.getCustomerIdCard();
        String customerPhone = customer.getCustomerPhone();

        if (!id.matches("^KH-[0-9]{4}$")) {
            errors.rejectValue("id", "idCustomer.matches");
        }
        if (!customerPhone.matches("((090[0-9]{7})|(091[0-9]{7})|(\\(84\\)\\+90[0-9]{7})|(\\(84\\)\\+91[0-9]{7}))")) {
            errors.rejectValue("customerPhone", "customerPhone.matches");
        }
        if (!customerIdCard.matches("([0-9]{9})|([0-9]{12})")) {
            errors.rejectValue("customerIdCard", "customerIdCard.matches");
        }
    }
}
