package com.wildcodeschool.myProjectWithSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/")
    public String welcomePage(){
        return "Welcome to the SHIELD";
    }
    @GetMapping("/avengers/assemble")
    public String shampions(){
        return  "Avengers... Assemble";
    }
    @GetMapping("/secret-bases")
    public String secret(){
        return "Biarritz ,Bordeaux ,La Loupe 🌲,Lille, Lyon , Nantes ,Orléans, Paris, Reims, Strasbourg, Toulouse";
    }
}
