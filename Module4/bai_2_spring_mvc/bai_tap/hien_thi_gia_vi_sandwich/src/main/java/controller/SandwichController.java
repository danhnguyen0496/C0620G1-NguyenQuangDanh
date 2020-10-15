package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {

    @GetMapping("/")
    public String goSandwich() {
        return "index";
    }

//    @GetMapping("/save")
//    public String save(@RequestParam("condiments") String[] condiments, Model model) {
//        String result = "";
//        for (int i = 0; i < condiments.length; i++) {
//            result += condiments[i];
//        }
//        model.addAttribute("result",result);
//        return "list_condiments";
//    }

    @GetMapping("/save")
    public String save(@RequestParam("condiments") String[] condiments, Model model) {
        model.addAttribute("condiments", condiments);
        return "list_condiments";
    }
}
