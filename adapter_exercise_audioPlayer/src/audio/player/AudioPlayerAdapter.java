package audio.player;

import video.player.MKVPlayer;
import video.player.MP4Player;
import video.player.VideoPlayer;

public class AudioPlayerAdapter implements AudioPlayer {

    // The service
    private VideoPlayer videoPlayer;

    public AudioPlayerAdapter(String mediaType) {
        if (mediaType.equalsIgnoreCase("mp4"))
            videoPlayer = new MP4Player();
        else if (mediaType.equalsIgnoreCase("mkv"))
            videoPlayer = new MKVPlayer();
    }

    /**
     * Plays the file according to the media type adapted to the video player.
     * @param mediaType the media type of the file to be played.
     * @param fileName the name of the file to be played.
     */
    @Override
    public void play(String mediaType, String fileName) {
        if (mediaType.equalsIgnoreCase("mp4"))
            videoPlayer.playMp4(fileName);
        else if (mediaType.equalsIgnoreCase("mkv"))
            videoPlayer.playMkv(fileName);
    }
}
