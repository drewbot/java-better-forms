package io.drewbot.betterforms.controllers;

import io.drewbot.betterforms.models.Secret;
import io.drewbot.betterforms.repositories.SecretRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecretController {

    @Autowired
    private SecretRepository secretRepo;

    @RequestMapping(value = "/secret/{id}")
    public String secretDetail(Model model, @PathVariable("id") Long id) {
        Secret mySecret = secretRepo.findOne(id);
        model.addAttribute("secret", mySecret);
        return "secret";
    }
}
