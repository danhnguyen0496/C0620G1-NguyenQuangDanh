package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.DictionaryService;

@Controller
public class DictionaryController {

    @Autowired
    private DictionaryService dictionaryService;

    @GetMapping("/")
    public String goDictionaryPage() {
        return "dictionary_home";
    }

    @GetMapping("/resultTranslate")
    public String resultTranslate(@RequestParam String word, Model model) {
        String translate = dictionaryService.translate(word);
        model.addAttribute("translate", translate);
        return "result_translate";
    }
}
