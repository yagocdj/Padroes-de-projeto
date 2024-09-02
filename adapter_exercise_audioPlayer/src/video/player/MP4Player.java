package video.player;

public class MP4Player implements VideoPlayer {
	   @Override
	   public void playMkv(String fileName) {
		 //não faz nada, pois este player não reconhece o padrão MKV
	   }

	   @Override
	   public void playMp4(String fileName) {
		   System.out.println("Reproduzindo arquivo MP4. Nome: "+ fileName);	
	   }
}
