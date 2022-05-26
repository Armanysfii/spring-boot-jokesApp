package com.arman.spring.jokes.controllers;

import com.arman.spring.jokes.services.CreateJokeService;
import com.arman.spring.jokes.services.CreateJokesServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CreateJokesController {

    private final CreateJokeService jokeService;

    public CreateJokesController(CreateJokeService createJokeService){
        this.jokeService =  createJokeService;
    }

    @RequestMapping("/")
    public String getJokes(Model model){

        model.addAttribute("joke",jokeService.getJoke());

        return "index";
    }
}
