package com.celes.proyecto.controllers;


import com.celes.proyecto.services.ChickenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewControllers {

    @Autowired
    ChickenService chickenService;
    @GetMapping(value = "/")
    public String homeView(Model model){
        int amountEaten =  chickenService.eat(10);
        model.addAttribute("Fedchickens", amountEaten);
        return "home";
    }
}
