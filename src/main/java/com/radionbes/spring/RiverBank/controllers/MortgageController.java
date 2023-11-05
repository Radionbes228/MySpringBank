package com.radionbes.spring.RiverBank.controllers;

import com.radionbes.spring.RiverBank.constant.ConstantValue;
import com.radionbes.spring.RiverBank.models.Mortgage;
import com.radionbes.spring.RiverBank.services.MortgageService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class MortgageController {
    private final MortgageService mortgageService;
    private final ConstantValue constantValue;

    @GetMapping("/mortgage")
    public String contribution(Model model){
        model.addAttribute("mortgages", mortgageService.getList());
        model.addAttribute("constants", constantValue.getINTARASTE_RATE());
        return "mortgageS/mortgage";
    }

    @PostMapping("/mortgage")
    public String contributionPost(Mortgage mortgage){
        mortgageService.saveContribution(mortgage);
        return "redirect:/mortgage";
    }

    @GetMapping("/mortgage/{id}")
    public String contributionGetForID(@PathVariable("id") Long id, Model model){
        model.addAttribute(mortgageService.getForId(id));
        return "mortgageS/mortgage-info";
    }
}
