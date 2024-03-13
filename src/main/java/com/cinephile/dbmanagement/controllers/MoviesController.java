package com.cinephile.dbmanagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MoviesController {
    @GetMapping("/showMovie")
    public String showMovieList() {
        return "movie-list";
    }
}
