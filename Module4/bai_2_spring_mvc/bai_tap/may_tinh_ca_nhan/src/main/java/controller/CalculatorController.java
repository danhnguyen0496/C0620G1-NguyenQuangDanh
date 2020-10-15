package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CalculatorService;

@Controller
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/")
    public String goIndex() {
        return "index";
    }

    @PostMapping("/calculator")
    public String goCalculator(@RequestParam String number1, @RequestParam String number2, @RequestParam String operator, Model model) {
        double result = calculatorService.calculator(Double.parseDouble(number1), Double.parseDouble(number2), operator);
        model.addAttribute("result", result);
        model.addAttribute("number1", number1);
        model.addAttribute("number2", number2);
        return "index";
    }
}
