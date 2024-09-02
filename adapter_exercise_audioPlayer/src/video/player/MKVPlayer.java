package video.player;

public class MKVPlayer implements VideoPlayer {
	   @Override
	   public void playMkv(String fileName) {
	      System.out.println("Reproduzindo arquivo MKV. Nome: "+ fileName);		
	   }

	   @Override
	   public void playMp4(String fileName) {
	      //não faz nada, pois este player não reconhece o padrão MP4
	   }
}
