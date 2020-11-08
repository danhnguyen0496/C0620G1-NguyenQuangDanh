package com.project_furama.entity.employee;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(name = "user_name")
    private String username;
    @Column(name = "password")
    private String password;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_name"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> likedRole;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Employee> employeeList;

    public User() {
    }



    public Set<Role> getLikedRole() {
        return likedRole;
    }

    public void setLikedRole(Set<Role> likedRole) {
        this.likedRole = likedRole;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
