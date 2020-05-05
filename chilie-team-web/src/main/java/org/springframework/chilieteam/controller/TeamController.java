package org.springframework.chilieteam.controller;

import org.springframework.chilieteam.services.TeamService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/team")
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping({"", "/"})
    public String getTeams(Model model) {
        model.addAttribute("teams", teamService.findAll());
        return "team";
    }
}
