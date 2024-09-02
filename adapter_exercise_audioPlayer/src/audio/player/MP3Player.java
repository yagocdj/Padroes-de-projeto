package audio.player;



public class MP3Player implements AudioPlayer {

	private AudioPlayerAdapter audioPlayerAdapter;

	/**
	 * Reproduces the file according to the media type.
	 * @param mediaType the media type of the file to be reproduced.
	 * @param fileName the name of the file to be reproduced.
	 */
	@Override
	public void play(String mediaType, String fileName) {
		if (mediaType.equalsIgnoreCase("mp3")) {  // MP3 file
			System.out.println("Reproduzindo arquivo mp3. Nome: " + fileName);			
		} else if (mediaType.equalsIgnoreCase("mp4") || mediaType.equalsIgnoreCase("mkv")) {
			// In case of MP4 or MKV file, the AudioPlayerAdapter is used to play the file.
			audioPlayerAdapter = new AudioPlayerAdapter(mediaType);
			audioPlayerAdapter.play(mediaType, fileName);
		} else  // Unkown media type
			System.out.println("Midia invalida. Formato " + mediaType + " nao suportado.");			
	}

}
