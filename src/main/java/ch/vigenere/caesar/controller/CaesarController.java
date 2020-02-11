package ch.vigenere.caesar.controller;

import ch.vigenere.caesar.model.Buchstabe;
import ch.vigenere.caesar.model.Caesar;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/caesar")
public class CaesarController {

    @GetMapping
    public String caesar(Model model) {
        model.addAttribute("caesar", new Caesar());
        return "caesar";
    }

    @PostMapping
    public String getInput(@ModelAttribute Caesar caesar, Model model) {
        caesar.encrypted = "Juhui";
        model.addAttribute("caesar", caesar);
        return "caesar";
    }

}
