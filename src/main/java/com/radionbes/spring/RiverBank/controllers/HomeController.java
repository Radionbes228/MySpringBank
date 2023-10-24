package com.radionbes.spring.RiverBank.controllers;


import com.radionbes.spring.RiverBank.services.CreditService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class HomeController {
    private CreditService creditService;

    @GetMapping("/home")
    public String homePage(Model model){
        model.addAttribute("creditService", creditService.getCrediteList());
        return "mainPageBank";
    }
}
