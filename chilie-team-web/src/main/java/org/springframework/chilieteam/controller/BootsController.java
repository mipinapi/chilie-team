//package org.springframework.chilieteam.controller;
//
//import org.springframework.chilieteam.repositories.BootsRepository;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//@RequestMapping("/boots")
//public class BootsController {
//
//    private final BootsRepository bootsRepository;
//
//    public BootsController(BootsRepository bootsRepository) {
//        this.bootsRepository = bootsRepository;
//    }
//
//    @GetMapping({"", "/"})
//    public String boots() {
//
//        return "boots";
//    }
//}
