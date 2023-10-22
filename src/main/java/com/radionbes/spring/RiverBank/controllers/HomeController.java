package com.radionbes.spring.RiverBank.controllers;

import com.radionbes.spring.RiverBank.models.Credit;
import com.radionbes.spring.RiverBank.services.CreditService;
import com.radionbes.spring.RiverBank.services.ServiceHomePage;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class HomeController {
    private ServiceHomePage serviceHomePage;
    private CreditService creditService;

    @GetMapping("/home")
    public String mainPageBank(Model model){
        model.addAttribute("men", serviceHomePage.getPerson());
        return "mainPageBank";
    }





    @GetMapping("/credit/{id}")
    public String getInfoCredit(@PathVariable Long id, Model model){
        model.addAttribute("credit", creditService.getCreditForId(id));
        return "info_credit";
    }


    @GetMapping("/credit")
    public String getCredit(Model model){
        model.addAttribute("credits", creditService.getCrediteList());
        return "credit";
    }

    @PostMapping("/credit")
    public String postCredit(Credit credit){
        creditService.saveCredit(credit);
        return "redirect:/credit";
    }


}
