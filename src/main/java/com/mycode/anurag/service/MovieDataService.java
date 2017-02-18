package com.mycode.anurag.service;

import com.mycode.anurag.domain.Movie;
import com.mycode.anurag.repository.MovieRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by anura on 2017-02-18.
 */

@Service
public class MovieDataService {

    @Autowired
    MovieRepository repository;
    Logger logger = LoggerFactory.getLogger(MovieDataService.class);

    public void saveMovie(Movie movie){
        repository.save(movie);
        logger.info("movie "+movie.getName()+ " is saved ");
    }

    public Movie findMovie(String movieName){
        logger.info("movie retrieved "+ movieName);
        return repository.findOne(movieName);
    }

    public List<Movie> findAllMovies(){
        //logger.info("movie retrieved "+movie.getName());
        List<Movie> movieList = new ArrayList<>();
         repository.findAll().forEach( movie->{
             movieList.add(movie) ;
         });
        return movieList;
    }


}
