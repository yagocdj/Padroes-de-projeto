package locadora;

public abstract class Classificacao {
	public static final int NORMAL = 0;
	public static final int LANCAMENTO = 1;
	public static final int INFANTIL = 2;
	
	abstract int getCodigoDePreco();
	abstract double getValorDoAluguel(int diasAlugado);
	
	public int getPontosDeAlugadorFrequente(int diasAlugado) {
		return 1;
	}
}
