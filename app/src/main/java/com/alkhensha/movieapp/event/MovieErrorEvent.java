package com.alkhensha.movieapp.event;

/**
 * Created by khenshaa on 12/14/17.
 */

public class MovieErrorEvent extends BaseEvent{
    public MovieErrorEvent(String message) {
        super(message);
    }
}