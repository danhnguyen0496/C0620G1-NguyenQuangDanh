package com.project_furama.entity.employee;

import com.project_furama.entity.contract.Contract;
import com.project_furama.entity.login.AppUser;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.PositiveOrZero;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee implements Validator {

    @Id
    @Column(name = "employee_id")
    private String employeeId;

    @Column(name = "employee_name")
    private String employeeName;

    @Column(name = "employee_birthday")
    private String employeeBirthday;

    @Column(name = "employee_id_card")
    private String employeeIdCard;

    @PositiveOrZero(message = "Wages are positive and greater than or equal to 0")
    @Column(name = "employee_salary")
    private String employeeSalary;

    @Column(name = "employee_phone")
    private String employeePhone;

    @Email
    @Column(name = "employee_email")
    private String employeeEmail;

    @Column(name = "employee_address")
    private String employeeAddress;

    public Employee() {
    }

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Contract> contractList;

    @ManyToOne
    @JoinColumn(name = "position_id", referencedColumnName = "position_id")
    private Position position;

    @ManyToOne
    @JoinColumn(name = "education_degree_id", referencedColumnName = "education_degree_id")
    private EducationDegree educationDegree;

    @ManyToOne
    @JoinColumn(name = "division_id", referencedColumnName = "division_id")
    private Division division;

    @OneToOne
    @JoinColumn(name = "User_Id", referencedColumnName = "User_Id")
    private AppUser appUser;

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

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


    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        Employee employee = (Employee) target;

        String employeePhone = employee.getEmployeePhone();
        String employeeIdCard = employee.getEmployeeIdCard();
        String employeeSalary = employee.getEmployeeSalary();

        if (!employeePhone.matches("((090[0-9]{7})|(091[0-9]{7})|(\\(84\\)\\+90[0-9]{7})|(\\(84\\)\\+91[0-9]{7}))")) {
            errors.rejectValue("employeePhone", "employeePhone.matches");
        }
        if (!employeeIdCard.matches("([0-9]{9})|([0-9]{12})")) {
            errors.rejectValue("employeeIdCard", "employeeIdCard.matches");
        }
    }
}
