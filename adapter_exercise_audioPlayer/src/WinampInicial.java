

import audio.player.AudioPlayer;
import audio.player.MP3Player;

public class WinampInicial {
   public static void main(String[] args) {
	      AudioPlayer audioPlayer = new MP3Player();

	      audioPlayer.play("mp3", "Eagles - Hotel California.mp3");
	      audioPlayer.play("mp4", "alone.mp4");
	      audioPlayer.play("vlc", "far far away.vlc");
	      audioPlayer.play("avi", "mind me.avi");
	   }
}
