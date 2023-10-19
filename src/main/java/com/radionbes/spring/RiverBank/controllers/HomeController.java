package com.radionbes.spring.RiverBank.controllers;

import com.radionbes.spring.RiverBank.services.ServiceHomePage;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class HomeController {
    private ServiceHomePage serviceHomePage;


    @GetMapping("/home")
    public String mainPageBank(Model model){
        model.addAttribute("men", serviceHomePage.getPerson());
        return "mainPageBank";
    }

    @GetMapping("/Prom")
    public String credit(Model model){
        model.addAttribute("men", "Alex");
        return null;
    }
}
