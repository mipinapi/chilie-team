package org.springframework.chilieteam.controller;

import org.springframework.chilieteam.repositories.CoachRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/coach")
public class CoachController {

    private final CoachRepository coachRepository;

    public CoachController(CoachRepository coachRepository) {
        this.coachRepository = coachRepository;
    }

    @GetMapping({"", "/"})
    public String getCoaches(Model model) {

        model.addAttribute("coaches", coachRepository.findAll());
        return "coach";
    }
}
