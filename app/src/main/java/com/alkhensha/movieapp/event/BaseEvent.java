package com.alkhensha.movieapp.event;

/**
 * Created by khenshaa on 12/14/17.
 */

public class BaseEvent {
    private String message;

    BaseEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
