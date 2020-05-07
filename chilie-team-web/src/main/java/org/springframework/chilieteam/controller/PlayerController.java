package org.springframework.chilieteam.controller;

import org.springframework.chilieteam.services.PlayerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/players")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping({"", "/"})
    public String getPlayers(Model model) {
        model.addAttribute("players", playerService.findAll());
        return "players";
    }


    @GetMapping("/find")
    public String findPlayers() {

        return "notimplemented";
    }
}
