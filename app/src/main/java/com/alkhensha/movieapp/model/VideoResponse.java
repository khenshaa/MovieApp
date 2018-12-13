package com.alkhensha.movieapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by khenshaa on 12/14/17.
 */

public class VideoResponse {
    @SerializedName("id")
    private int movieId;

    @SerializedName("results")
    private List<Video> results;

    public int getMovieId() {
        return movieId;
    }

    public List<Video> getResults() {
        return results;
    }
}
