package ch.vigenere.caesar.controller;

import model.Buchstabe;
import model.Caesar;
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
        return "caesar";
    }
    @PostMapping("/caesarInput")
    public String getInput(@ModelAttribute Caesar klartext, Buchstabe buchstabe, Model model){
        model.addAttribute ("klartext", klartext);
        model.addAttribute("letter",buchstabe);
        model.addAttribute("geheimtext", "Test");
        return "caesar2";
    }

}
