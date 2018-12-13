package com.alkhensha.movieapp.event;


import com.alkhensha.movieapp.model.VideoResponse;

/**
 * Created by khenshaa on 12/14/17.
 */

public class MovieTrailerEvent extends BaseEvent {
    private  VideoResponse body;

    public MovieTrailerEvent(String message, VideoResponse body) {
        super(message);
        this.body = body;
    }

    public VideoResponse getBody() {

        return body;
    }
}
