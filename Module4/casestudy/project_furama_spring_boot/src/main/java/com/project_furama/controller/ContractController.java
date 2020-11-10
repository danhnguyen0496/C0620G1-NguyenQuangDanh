package com.project_furama.controller;

import com.project_furama.entity.contract.Contract;
import com.project_furama.entity.contract.ContractDetail;
import com.project_furama.service.contract_service.AttachServiceService;
import com.project_furama.service.contract_service.ContractDetailService;
import com.project_furama.service.contract_service.ContractService;
import com.project_furama.service.customer_service.CustomerService;
import com.project_furama.service.employee_service.EmployeeService;
import com.project_furama.service.service_service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@SessionAttributes("userLogin")
public class ContractController {

    @Autowired
    private ContractService contractService;

    @Autowired
    private ContractDetailService contractDetailService;

    @Autowired
    private AttachServiceService attachServiceService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ServiceService serviceService;

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/home-contract")
    public String goHomeContract(Model model, @PageableDefault(size = 5) Pageable pageable,
                                 @RequestParam Optional<String> keyword) {
        String keywordOld = "";
        if (keyword.isPresent()) {
            keywordOld = keyword.get();
            model.addAttribute("listContract", this.contractService.findAllByContractId(keywordOld, pageable));
        } else {
            model.addAttribute("listContract", this.contractService.findAll(pageable));
        }
        model.addAttribute("keywordOld", keywordOld);
        return "contract/home_contract";
    }

    @GetMapping("/create-contract")
    public String formCreateContract(Model model) {
        model.addAttribute("contract", new Contract());
        model.addAttribute("listCustomer", this.customerService.findAll());
        model.addAttribute("listService", this.serviceService.findAll());
        model.addAttribute("listEmployee", this.employeeService.findAllEmployee());
        return "contract/create_contract";
    }

    @PostMapping("/save-contract")
    public String saveContract(@ModelAttribute Contract contract) {
        this.contractService.save(contract);
        return "redirect:/home-contract";
    }

    @GetMapping("/update-contract/{id}")
    public String updateContract(Model model, @PathVariable String id) {
        model.addAttribute("contract", this.contractService.findById(id));
        model.addAttribute("listCustomer", this.customerService.findAll());
        model.addAttribute("listService", this.serviceService.findAll());
        model.addAttribute("listEmployee", this.employeeService.findAllEmployee());
        return "contract/update_contract";
    }

    @PostMapping("/save-update-contract")
    public String saveUpdateContract(@ModelAttribute Contract contract) {
        this.contractService.save(contract);
        return "redirect:/home-contract";
    }

    @PostMapping("/delete-contract")
    public String deleteContract(@RequestParam String idDeleteHidden) {
        this.contractService.remove(idDeleteHidden);
        return "redirect:/home-contract";
    }

    @GetMapping("/create-contract-detail")
    public String formCreateContractDetail(Model model) {
        model.addAttribute("contractDetail", new ContractDetail());
        model.addAttribute("listContract", this.contractService.findAll());
        model.addAttribute("listAttachService", this.attachServiceService.findAll());
        return "contract/create_contract_detail";
    }

    @PostMapping("/save-contract-detail")
    public String saveContractDetail(@ModelAttribute ContractDetail contractDetail, Model model) {
        this.contractDetailService.save(contractDetail);
        model.addAttribute("listContractDetail", this.contractDetailService.findAll());
        return "contract/home_contract_detail";
    }

}
