package com.radionbes.spring.RiverBank.controllers;


import  com.radionbes.spring.RiverBank.services.CardsService;
import com.radionbes.spring.RiverBank.services.CreditService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class HomeController {
    private CreditService creditService;
    private CardsService cardsService;

    @GetMapping("/home")
    public String homePage(Model model){
        model.addAttribute("cardsList", cardsService.getCardList());
        model.addAttribute("creditService", creditService.getCrediteList());
        return "mainPageBank";
    }
}
