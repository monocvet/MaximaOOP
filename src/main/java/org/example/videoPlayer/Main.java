package org.example.videoPlayer;

public class Main {
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer();
        PlayerAdapter playerAdapter = new PlayerAdapter(videoPlayer);
        playerAdapter.play();
    }
}
