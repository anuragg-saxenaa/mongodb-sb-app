package com.mycode.anurag.repository;

import com.mycode.anurag.domain.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by anura on 2017-02-18.
 */
@Component
public interface MovieRepository extends CrudRepository<Movie,String> {
}
