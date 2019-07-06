package com.example.foodentertainmenet;

public class VideosItems {
    String VideoName;
    int Videoimg;

    public VideosItems(String videoName, int videoimg) {
        VideoName = videoName;
        Videoimg = videoimg;
    }

    public String getVideoName() {
        return VideoName;
    }

    public int getVideoimg() {
        return Videoimg;
    }
}
