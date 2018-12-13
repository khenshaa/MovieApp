package com.alkhensha.movieapp.event;

import com.alkhensha.movieapp.model.ReviewResponse;

/**
 * Created by khenshaa on 12/14/17.
 */

public class MovieReviewEvent extends BaseEvent{
    private ReviewResponse body;

    public MovieReviewEvent(String message, ReviewResponse body) {
        super(message);
        this.body = body;
    }

    public ReviewResponse getBody() {

        return body;
    }
}
