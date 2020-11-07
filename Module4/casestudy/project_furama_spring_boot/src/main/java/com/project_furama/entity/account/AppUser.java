//package com.project_furama.entity.account;
//
//import com.fasterxml.jackson.annotation.JsonBackReference;
//import com.project_furama.entity.employee.Employee;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "user", //
//        uniqueConstraints = { //
//                @UniqueConstraint(name = "APP_USER_UK", columnNames = "User_Name")})
//public class AppUser {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "User_Id")
//    private Long userId;
//
//    @Column(name = "User_Name", length = 36, nullable = false)
//    private String userName;
//
//    @Column(name = "Encryted_Password", length = 128, nullable = false)
//    private String encrytedPassword;
//
//    @Column(name = "Enabled", length = 1, nullable = false)
//    private boolean enabled;
//
//    public AppUser() {
//    }
//
//    @OneToOne(mappedBy = "appUser")
//    @JsonBackReference
//    private Employee employee;
//
//    public Long getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Long userId) {
//        this.userId = userId;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getEncrytedPassword() {
//        return encrytedPassword;
//    }
//
//    public void setEncrytedPassword(String encrytedPassword) {
//        this.encrytedPassword = encrytedPassword;
//    }
//
//    public boolean isEnabled() {
//        return enabled;
//    }
//
//    public void setEnabled(boolean enabled) {
//        this.enabled = enabled;
//    }
//
//}
