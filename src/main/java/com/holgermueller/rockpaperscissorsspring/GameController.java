package com.holgermueller.rockpaperscissorsspring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GameController {

    @GetMapping("/game")
    public String gameForm(Model model) {
        model.addAttribute("game", new Game());
        return "game";
    }

    // @PostMapping("/game")
    // public String gameSubmit(@ModelAttribute Game game, Model model) {
    // model.addAttribute("game", game);
    // return game;
    // }

}
