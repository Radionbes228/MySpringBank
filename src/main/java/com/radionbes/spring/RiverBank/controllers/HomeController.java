package com.radionbes.spring.RiverBank.controllers;


//import com.radionbes.spring.RiverBank.Rate.ExchangeRate;
import  com.radionbes.spring.RiverBank.services.CardsService;
import com.radionbes.spring.RiverBank.services.CreditService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
@AllArgsConstructor
public class HomeController {
    private CardsService cardsService;
//    private ExchangeRate exchangeRate;


    @GetMapping("/home")
    public String homePage(Model model) throws Exception {
        model.addAttribute("cardsList", cardsService.getCardList());
//        model.addAttribute("exchangeRate", exchangeRate.getDocumentPage());
        return "mainPageBank";
    }
}
