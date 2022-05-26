package com.arman.spring.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class CreateJokesServiceImpl implements CreateJokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public CreateJokesServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke(){
        return chuckNorrisQuotes.getRandomQuote();
    }
}
