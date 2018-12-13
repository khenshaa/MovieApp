package com.alkhensha.movieapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by khenshaa on 12/14/17.
 */

public class ReviewResponse {
    @SerializedName("id")
    private int id;

    @SerializedName("results")
    private List<Review> results;

    public int getId() {
        return id;
    }

    public List<Review> getResults() {
        return results;
    }
}
