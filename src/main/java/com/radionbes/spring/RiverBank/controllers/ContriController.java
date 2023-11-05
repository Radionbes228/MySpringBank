package com.radionbes.spring.RiverBank.controllers;

import com.radionbes.spring.RiverBank.models.Contri;
import com.radionbes.spring.RiverBank.services.ContriService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class ContriController {
    private ContriService contriService;

    @GetMapping("/contri")
    public String contriHome(Model model){
        model.addAttribute("contriES", contriService.getContriList());
        return "contriS/contri";
    }

    @PostMapping("/contri")
    public String contriHomePost(Contri contri){
        contriService.save(contri);
        return "redirect:/contri";
    }


    @GetMapping("/contri/info/{id}")
    public String info(@PathVariable("id") Long id, Model model){
        model.addAttribute("contri_info", contriService.findById(id));
        return "contriS/contri-info";
    }
}
