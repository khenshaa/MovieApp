package com.alkhensha.movieapp.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by khenshaa on 12/14/17.
 */

public class Review {
    @SerializedName("id")
    private String reviewId;

    @SerializedName("author")
    private String author;

    @SerializedName("content")
    private String content;

    @SerializedName("url")
    private String url;

    public String getReviewId() {
        return reviewId;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public String getUrl() {
        return url;
    }
}
