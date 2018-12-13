package com.alkhensha.movieapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by khenshaa on 12/14/17.
 */

public class MovieResponse {
    @SerializedName("results")
    private List<Movie> results;

    public List<Movie> getResults() {
        return results;
    }
}
