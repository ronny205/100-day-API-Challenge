package com.ronnie.movie.service;


import com.ronnie.movie.model.MovieModel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieService {

    private final String API_KEY = "";
    private final String BASE_URL = "http://www.omdbapi.com/?apikey=" + API_KEY + "&t=";

    public Movie getMovieDetails(String title) {
        RestTemplate restTemplate = new RestTemplate();
        String url = BASE_URL + title.replace(" ", "+");
        return restTemplate.getForObject(url, Movie.class);
    }
}
