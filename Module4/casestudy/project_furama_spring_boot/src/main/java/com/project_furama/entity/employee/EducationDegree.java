package com.project_furama.entity.employee;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "education_degree")
public class EducationDegree {

    @Id
    @Column(name = "education_degree_id")
    private String educationDegreeId;
    @Column(name = "education_degree_name")
    private String educationDegreeName;

    public EducationDegree() {
    }

    @OneToOne(mappedBy = "educationDegree")
    @JsonBackReference
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
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
