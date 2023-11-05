package com.radionbes.spring.RiverBank.controllers;


import com.radionbes.spring.RiverBank.services.CardsService;


import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@AllArgsConstructor
public class CardController {
   // private final Logger logger = Logger.getLogger("CardController");
    private final CardsService cardsService;

    @GetMapping("/card-info/{id}")
    public String cardInfo(@PathVariable("id") Long id, Model model){
        model.addAttribute("card", cardsService.getCardFoById(id));
        return "cardS/card-info";
    }

    @GetMapping("/translation/{id}")
    public String translation(@PathVariable("id") Long id, Model model){
        model.addAttribute("cards", cardsService.getCardList());
        model.addAttribute("thisCard", cardsService.getCardFoById(id));
        return "cardS/translation";
    }

    @PostMapping("/translation/{id}")
    public String translationPost(@PathVariable Long id, @Valid Integer sum, @Valid Long cardId){
        cardsService.update(id, cardId, sum);
        return "redirect:/home";
    }
}
