package com.radionbes.spring.RiverBank.controllers;

import com.radionbes.spring.RiverBank.constant.ConstantValue;
import com.radionbes.spring.RiverBank.models.Credit;
import com.radionbes.spring.RiverBank.services.CreditService;
import com.radionbes.spring.RiverBank.services.ServiceHomePage;
import lombok.AllArgsConstructor;
import org.apache.tomcat.util.bcel.Const;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class CreditController {
    private final CreditService creditService;
    @GetMapping("/credit")
    public String getCredit(Model model){
        model.addAttribute("credits", creditService.getCrediteList());
        return "creditS/credit";
    }

    @PostMapping("/credit")
    public String postCredit(Credit credit){
        creditService.saveCredit(credit);
        return "redirect:/";
    }


    @GetMapping("/credit/{id}")
    public String getInfoCredit(@PathVariable Long id, Model model){
        model.addAttribute("credit", creditService.getCreditForId(id));
        return "creditS/info-credit";
    }


    @PostMapping("/credit/delete/{id}")
    public String deleteCredit(@PathVariable("id") Long id){
        creditService.deleteCredit(id);
        return "redirect:/credit";
    }

}
