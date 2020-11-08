package com.project_furama.controller;

import com.project_furama.entity.service.Service;
import com.project_furama.service.service_service.RentTypeService;
import com.project_furama.service.service_service.ServiceService;
import com.project_furama.service.service_service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ServiceController {

    @Autowired
    private ServiceService serviceService;

    @Autowired
    private RentTypeService rentTypeService;

    @Autowired
    private ServiceTypeService serviceTypeService;

    @GetMapping("/home-service")
    public String goHomeService(Model model, @PageableDefault(size = 5) Pageable pageable,
                                @RequestParam Optional<String> keyword) {
        String keywordOld = "";
        if (keyword.isPresent()) {
            keywordOld = keyword.get();
            model.addAttribute("listService", this.serviceService.findAllByServiceNameContaining(keywordOld, pageable));
        } else {
            model.addAttribute("listService", this.serviceService.findAll(pageable));
        }
        model.addAttribute("keywordOld", keywordOld);
        return "service/home_service";
    }

    @GetMapping("/create-service")
    public String createFormService(Model model) {
        model.addAttribute("service", new Service());
        model.addAttribute("listRentType", this.rentTypeService.findAll());
        model.addAttribute("listServiceType", this.serviceTypeService.findAll());
        return "service/create_service";
    }

    @PostMapping("save-service")
    public String saveService(@ModelAttribute Service service) {
        this.serviceService.save(service);
        return "redirect:/home-service";
    }

    @PostMapping("/delete-service")
    public String deleteService(@RequestParam String idDeleteHidden) {
        this.serviceService.remove(idDeleteHidden);
        return "redirect:/home-service";
    }

    @GetMapping("/update-service/{id}")
    public String formUpdateService(@PathVariable String id, Model model) {
        model.addAttribute("service", this.serviceService.findById(id));
        model.addAttribute("listServiceType", this.serviceTypeService.findAll());
        model.addAttribute("listRentType",this.rentTypeService.findAll());
        return "service/update_service";
    }

    @PostMapping("/save-update-service")
    public String updateService(@ModelAttribute Service service) {
        this.serviceService.save(service);
        return "redirect:/home-service";
    }
}
