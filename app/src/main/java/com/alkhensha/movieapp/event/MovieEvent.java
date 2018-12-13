package com.alkhensha.movieapp.event;


import java.util.List;

import com.alkhensha.movieapp.model.Movie;
import com.alkhensha.movieapp.util.Constant;

/**
 * Created by khenshaa on 12/14/17.
 */

public class MovieEvent extends BaseEvent {
    private final List<Movie> results;
    private final Constant.Data.MOVIE_LIST_TITLE movieListTitle;

    public MovieEvent(String message, List<Movie> results, Constant.Data.MOVIE_LIST_TITLE movieListTitle) {
        super(message);
        this.results = results;
        this.movieListTitle = movieListTitle;
    }

    public List<Movie> getResults() {
        return results;
    }

    public Constant.Data.MOVIE_LIST_TITLE getMovieListTitle() {
        return movieListTitle;
    }

}
