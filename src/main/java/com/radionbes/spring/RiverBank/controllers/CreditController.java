package com.radionbes.spring.RiverBank.controllers;

import com.radionbes.spring.RiverBank.Users.User;
import com.radionbes.spring.RiverBank.constant.ConstantValue;
import com.radionbes.spring.RiverBank.models.Credit;
import com.radionbes.spring.RiverBank.repozitories.UserRepositories;
import com.radionbes.spring.RiverBank.services.CreditService;
import com.radionbes.spring.RiverBank.services.ServiceHomePage;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.apache.tomcat.util.bcel.Const;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;
import java.util.List;

@Controller
@AllArgsConstructor
public class CreditController {
    private final CreditService creditService;
    private final UserRepositories userRepositories;
    @GetMapping("/credit")
    public String getCredit(/*@RequestParam(name = "owner", required = false)*/ Model model){
        List<Credit> credits = creditService.creditList(1L);
        model.addAttribute("credits", credits);
        return "creditS/credit";
    }

    @PostMapping("/credit")
    public String postCredit(Credit credit){
        credit.setOwner(1L);
        creditService.saveCredit(credit);
            return "redirect:/credit";
    }


    @GetMapping("/credit/{id}")
    public String getInfoCredit(@PathVariable Long id, Model model){
        model.addAttribute("credit", creditService.getCredit(id));
        return "creditS/info-credit";
    }


    @PostMapping("/credit/delete/{id}")
    public String deleteCredit(@PathVariable("id") Long id){
        creditService.deleteCredit(id);
        return "redirect:/credit";
    }

}
