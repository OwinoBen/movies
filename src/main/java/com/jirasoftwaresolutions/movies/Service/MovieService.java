package com.jirasoftwaresolutions.movies.Service;

import com.jirasoftwaresolutions.movies.Model.Movie;
import com.jirasoftwaresolutions.movies.Repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired // tell the compiler to instanciate this class for us instead of us creating the constructor for instantiation in the main class
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId){ //Optional allows the function to return null if no object was found
        return movieRepository.findByimdbId(imdbId);
    }
}
