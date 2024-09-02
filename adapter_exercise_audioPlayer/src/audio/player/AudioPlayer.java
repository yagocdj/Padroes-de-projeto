package audio.player;

/**
 * This class servers as a client interface.
 * It's good to have an interface to make it easier to change the adapter.
 */
public interface AudioPlayer {
	public void play(String mediaType, String fileName);
}