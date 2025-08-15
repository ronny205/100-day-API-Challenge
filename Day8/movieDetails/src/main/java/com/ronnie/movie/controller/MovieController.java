package com.ronnie.movie.controller;

import com.ronnie.movie.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController (MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/{title}")
    public Movie getMovie(@PathVariable String title){
        return movieService.getMovieDetails(title);
    }
}
