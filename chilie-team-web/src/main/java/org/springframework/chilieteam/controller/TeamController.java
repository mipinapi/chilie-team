package org.springframework.chilieteam.controller;

import org.springframework.chilieteam.repositories.TeamRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/team")
public class TeamController {

    private final TeamRepository teamRepository;

    public TeamController(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @GetMapping({"", "/"})
    public String getTeams(Model model) {

        model.addAttribute("teams", teamRepository.findAll());
        return "team";
    }
}
