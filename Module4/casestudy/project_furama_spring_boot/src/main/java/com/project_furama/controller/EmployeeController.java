package com.project_furama.controller;

import com.project_furama.entity.employee.Employee;
import com.project_furama.repository.employee_repository.EmployeeRepository;
import com.project_furama.service.employee_service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DivisionService divisionService;

    @Autowired
    private EducationDegreeService educationDegreeService;

    @Autowired
    private PositionService positionService;

    @Autowired
    private UserService userService;

    @GetMapping("/home-employee")
    public String goHomeEmployee(Model model, @PageableDefault(size = 5) Pageable pageable,
                                 @RequestParam Optional<String> keyword) {
        String keywordOld = "";
        if (keyword.isPresent()) {
            keywordOld = keyword.get();
            model.addAttribute("listEmployee", this.employeeService.findAllByEmployeeNameContaining(keywordOld, pageable));
        } else {
            model.addAttribute("listEmployee", this.employeeService.findAll(pageable));
        }
        model.addAttribute("keywordOld", keywordOld);
        return "employee/home_employee";
    }

    @GetMapping("/create-employee")
    public String formCreateEmployee(Model model) {
        model.addAttribute("employee", new Employee());
        model.addAttribute("listDivision", this.divisionService.findAll());
        model.addAttribute("listPosition", this.positionService.findAll());
        model.addAttribute("listEducationDegree", this.educationDegreeService.findAll());
        model.addAttribute("listUser", this.userService.findAll());
        return "employee/create_employee";
    }

    @PostMapping("/save-employee")
    public String saveEmployee(@ModelAttribute Employee employee) {
        this.employeeService.save(employee);
        return "redirect:/home-employee";
    }

    @GetMapping("/update-employee/{id}")
    public String updateEmployee(@PathVariable String id, Model model) {
        model.addAttribute("employee", this.employeeService.findById(id));
        model.addAttribute("listDivision", this.divisionService.findAll());
        model.addAttribute("listPosition", this.positionService.findAll());
        model.addAttribute("listEducationDegree", this.educationDegreeService.findAll());
        model.addAttribute("listUser", this.userService.findAll());
        return "employee/update_employee";
    }

    @PostMapping("/save-update-employee")
    public String saveUpdateEmployee(@ModelAttribute Employee employee) {
        this.employeeService.save(employee);
        return "redirect:/home-employee";
    }

    @PostMapping("/delete-employee")
    public String deleteEmployee(@RequestParam String idDeleteHidden) {
        this.employeeService.remove(idDeleteHidden);
        return "redirect:/home-employee";
    }
}
