package ch.vigenere.caesar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/caesar")
public class CaesarController {

    @GetMapping

    public String Caesar(Model model){
        model.addAttribute("bla", "Hello World");
        return "caesar";
    }

}
