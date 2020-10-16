package controller;

import model.Letter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import service.LetterService;


@Controller
public class LetterController {

    @Autowired
    LetterService letterService;

    @GetMapping({"/", "/letter"})
    public String getUpdate(Model model) {
        model.addAttribute("letter", letterService.getLetter());
        return "letter";
    }
    @GetMapping("/showletter")
    public String getLetter(Model model) {
        model.addAttribute("letter", letterService.getLetter());
        return "show_letter";
    }

    @GetMapping("/showInformation")
    public String showInformation(@ModelAttribute Letter letter, RedirectAttributes redirectAttributes) {
        letterService.update(letter);
        return "redirect:/showletter";
    }
}
