package org.springframework.chilieteam.controller;

import org.springframework.chilieteam.services.CoachService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/coach")
public class CoachController {

    private final CoachService coachService;

    public CoachController(CoachService coachService) {
        this.coachService = coachService;
    }

    @GetMapping({"", "/"})
    public String getCoaches(Model model) {
        model.addAttribute("coaches", coachService.findAll());
        return "coach";
    }
}
