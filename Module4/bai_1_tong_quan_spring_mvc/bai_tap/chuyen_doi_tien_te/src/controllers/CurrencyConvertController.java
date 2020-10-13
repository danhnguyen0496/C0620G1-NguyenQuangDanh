package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.ConvertService;

@Controller
public class CurrencyConvertController {

    @Autowired
    private ConvertService convertService;

    @GetMapping({"/", "/currencyConvertPage"})
    public String goCurrencyConvert() {
        return "currency_convert";
    }

    @GetMapping("/currencyConvert")
    public String currencyConvert(@RequestParam String usd, @RequestParam String rate, Model model) {
        double result = convertService.currencyConvert(Double.parseDouble(usd), Double.parseDouble(rate));
        // String finalResult = String.format(".0f", result); // định dạng số kiểu 3.0EE
        model.addAttribute("result", result);
        return "result";
    }
}
