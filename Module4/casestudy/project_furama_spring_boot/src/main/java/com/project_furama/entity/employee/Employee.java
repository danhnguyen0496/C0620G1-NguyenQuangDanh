package com.project_furama.entity.employee;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
//import com.project_furama.entity.account.AppUser;
import com.project_furama.entity.contract.Contract;

import javax.persistence.*;
import java.util.List;

@Entity(name = "employee")
public class Employee {

    @Id
    @Column(name = "employee_id")
    private String employeeId;
    @Column(name = "employee_name")
    private String employeeName;
    @Column(name = "employee_birthday")
    private String employeeBirthday;
    @Column(name = "employee_id_card")
    private String employeeIdCard;
    @Column(name = "employee_salary")
    private String employeeSalary;
    @Column(name = "employee_phone")
    private String employeePhone;
    @Column(name = "employee_email")
    private String employeeEmail;
    @Column(name = "employee_address")
    private String employeeAddress;

    private String userName;

    public Employee() {
    }

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Contract> contractList;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "position_id", referencedColumnName = "position_id")
    @JsonManagedReference
    private Position position;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "education_degree_id", referencedColumnName = "education_degree_id")
    @JsonManagedReference
    private EducationDegree educationDegree;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "division_id", referencedColumnName = "division_id")
    @JsonManagedReference
    private Division division;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "User_Id",referencedColumnName = "User_Id")
//    @JsonManagedReference
//    private AppUser appUser;

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeBirthday() {
        return employeeBirthday;
    }

    public void setEmployeeBirthday(String employeeBirthday) {
        this.employeeBirthday = employeeBirthday;
    }

    public String getEmployeeIdCard() {
        return employeeIdCard;
    }

    public void setEmployeeIdCard(String employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public String getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(String employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
