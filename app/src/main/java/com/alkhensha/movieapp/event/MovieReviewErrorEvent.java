package com.alkhensha.movieapp.event;

/**
 * Created by khenshaa on 12/14/17.
 */

public class MovieReviewErrorEvent extends BaseEvent{
    public MovieReviewErrorEvent(String message) {
        super(message);
    }
}
