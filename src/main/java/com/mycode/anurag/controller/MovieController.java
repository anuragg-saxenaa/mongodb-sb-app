package com.mycode.anurag.controller;


import com.mycode.anurag.domain.Movie;
import com.mycode.anurag.service.MovieDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by anura on 2017-02-18.
 */
@RestController
public class MovieController {
    @Autowired
    MovieDataService movieDataService;

    @RequestMapping(value = "/saveMovie",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    void saveMovie(@RequestBody Movie movie){
            movieDataService.saveMovie(movie);
    }

    @RequestMapping(value = "/movie/{movieName}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    Movie getMovie(@PathVariable String movieName){
        Movie movie = movieDataService.findMovie(movieName);
        return movie;
    }

    @RequestMapping(value = "/movies",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    List<Movie> getMovie(){
        return movieDataService.findAllMovies();
    }



}
