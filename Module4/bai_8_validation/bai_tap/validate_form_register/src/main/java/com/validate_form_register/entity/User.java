package com.validate_form_register.entity;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity(name = "user")
public class User implements Validator {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;

    @NotBlank
    @Size(min = 5, max = 45)
    private String firstName;

    @NotBlank
    @Size(min = 5, max = 45)
    private String lastName;

    @NotBlank
    private String phoneNumber;

    @NotBlank
    private String age;

    @Email(message = "cat")
    @NotBlank
    private String email;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Custom Validation
    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;

        String checkAge = user.getAge();
        String checkPhoneNumber = user.getPhoneNumber();

        if (Integer.parseInt(checkAge) < 18) {
            errors.rejectValue("age", "age.Integer");
        }
        if (!checkPhoneNumber.matches("^[0-9]{10,11}$")) {
            errors.rejectValue("phoneNumber", "phoneNumber.matches");
        }
    }
}
