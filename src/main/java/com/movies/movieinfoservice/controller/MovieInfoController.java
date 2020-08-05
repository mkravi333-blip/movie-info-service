package com.movies.movieinfoservice.controller;

import com.movies.movieinfoservice.model.Movie;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/movies", produces = {MediaType.APPLICATION_JSON_VALUE})
public class MovieInfoController {

    @GetMapping(path = "/getMovieInfo/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") int movieId){

        return new Movie(1, "Titanic");

    }
}
