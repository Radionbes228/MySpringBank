package com.radionbes.spring.RiverBank.controllers;

import com.radionbes.spring.RiverBank.constant.ConstantValue;
import com.radionbes.spring.RiverBank.models.Contribution;
import com.radionbes.spring.RiverBank.services.ContributionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class ContributionController {
    private final ContributionService contributionService;
    private final ConstantValue constantValue;
    @GetMapping("/contribution")
    public String contribution(Model model){
        model.addAttribute("contributions", contributionService.getList());
        model.addAttribute("constants", constantValue.getINTARASTE_RATE());
        return "contributionS/contribution";
    }

    @PostMapping("/contribution")
    public String contributionPost(Contribution contribution){
        contributionService.saveContribution(contribution);
        return "redirect:/contribution";
    }

    @GetMapping("/contribution/{id}")
    public String contributionGetForID(@PathVariable("id") Long id, Model model){
        model.addAttribute(contributionService.getForId(id));
        return "contributionS/contribution-info";
    }
}
