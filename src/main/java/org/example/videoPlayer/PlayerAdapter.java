package org.example.videoPlayer;

public class PlayerAdapter implements MediaPlayer {
    private VideoPlayer videoPlayer;

    public PlayerAdapter(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void play() {
        videoPlayer.playAvi();
    }
}
