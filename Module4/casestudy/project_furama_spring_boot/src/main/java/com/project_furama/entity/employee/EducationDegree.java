package com.project_furama.entity.employee;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity(name = "education_degree")
public class EducationDegree {

    @Id
    @Column(name = "education_degree_id")
    private String educationDegreeId;
    @Column(name = "education_degree_name")
    private String educationDegreeName;

    public EducationDegree() {
    }

    @OneToMany(mappedBy = "educationDegree", cascade = CascadeType.ALL)
    private List<Employee> employeeList;

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public String getEducationDegreeId() {
        return educationDegreeId;
    }

    public void setEducationDegreeId(String educationDegreeId) {
        this.educationDegreeId = educationDegreeId;
    }

    public String getEducationDegreeName() {
        return educationDegreeName;
    }

    public void setEducationDegreeName(String educationDegreeName) {
        this.educationDegreeName = educationDegreeName;
    }
}
