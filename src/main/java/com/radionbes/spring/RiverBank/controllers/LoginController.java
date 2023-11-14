package com.radionbes.spring.RiverBank.controllers;

import com.radionbes.spring.RiverBank.Users.User;
import com.radionbes.spring.RiverBank.services.UsersService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;

@Controller
@AllArgsConstructor
public class LoginController {
    private UsersService usersService;


    @GetMapping("/loginPage")
    public String log(Principal principal, Model model){
        model.addAttribute("user", usersService.getUserByPrincipal(principal));
        return "autorisation/login";
    }

    @PostMapping("/loginPage")
    public String logPost(){

        return "redirect:/home";
    }



    @GetMapping("/registration")
    public String registr(User user, Model model){
        model.addAttribute("userNew", user);
        return "autorisation/registrPage";
    }

    @PostMapping("/registration")
    public String registrPost(User user){
        usersService.createUser(user);
        return "redirect:/loginPage";
    }
}
