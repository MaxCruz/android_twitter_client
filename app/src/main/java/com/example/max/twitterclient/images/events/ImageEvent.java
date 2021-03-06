package com.example.max.twitterclient.images.events;

import com.example.max.twitterclient.entities.Image;

import java.util.List;

public class ImageEvent {

    private String error;
    private List<Image> images;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

}
