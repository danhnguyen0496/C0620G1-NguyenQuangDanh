package com.tao_gio_hang.controller;

import com.tao_gio_hang.entity.Product;
import com.tao_gio_hang.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@SessionAttributes({"userLogin", "productListCart"})
public class ProductController {

    @Autowired
    private ProductService productService;

    @ModelAttribute("productListCart")
    public List<Product> productListProduct() {
        return new ArrayList<>();
    }

    @GetMapping("/home")
    public String goHomeCart(Model model) {
        model.addAttribute("listProduct", this.productService.findAll());
        return "home_product";
    }

    @GetMapping("/create")
    public String viewFormCreate(Model model) {
        model.addAttribute("listProduct", new Product());
        return "create_product";
    }

    @PostMapping("/create")
    public String createCart(Product product) {
        this.productService.save(product);
        return "redirect:/home";
    }


    @GetMapping("/delete/{id}")
    public String deleteCart(@PathVariable Integer id) {
        this.productService.remove(id);
        return "redirect:/home";
    }

    @GetMapping("/buyProduct/{id}")
    public String goFormBuyProduct(Model model, @PathVariable Integer id) {
        model.addAttribute("product", this.productService.findById(id));
        return "buy_product";
    }

    @PostMapping("/buyProduct")
    public String formBuyProduct(Product product, @ModelAttribute(value = "productListCart") List<Product> productListCart) {
        productListCart.add(this.productService.findById(product.getId()));
        return "redirect:/home";
    }

    @GetMapping("/viewListCart")
    public String viewListCart(@ModelAttribute("productListCart") List<Product> productList, Model model) {
        model.addAttribute("productListCart", productList);
        return "list_cart";
    }

    @GetMapping("/delete-cart/{id}")
    public String deleteCart(@PathVariable Integer id, @ModelAttribute(value = "productListCart") List<Product> productListCart) {
//        for (int i = 0; i < productListCart.size(); i++) {
//            if(productListCart.get(i).getId().equals(id)){
//                productListCart.remove((productListCart.get(i)));
//            }
//        }
        productListCart.removeIf(product -> product.getId().equals(id));
        return "redirect:/viewListCart";
    }
}


