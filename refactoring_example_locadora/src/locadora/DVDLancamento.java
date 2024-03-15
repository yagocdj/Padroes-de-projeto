package locadora;

public class DVDLancamento extends Classificacao {
	
	private static final int PONTO_SIMPLES = 1;
	private static final int PONTO_EXTRA = 2;

	@Override
	public int getCodigoDePreco() {
		return 1;
	}

	@Override
	public double getValorDoAluguel(int diasAlugado) {
		return diasAlugado * 3.0;
	}
	
	@Override
	public int getPontosDeAlugadorFrequente(int diasAlugado) {
		if (diasAlugado > 1) {
			return PONTO_EXTRA;
		}
		return PONTO_SIMPLES;
	}
}
