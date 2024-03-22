package locadora;

public class DVDNormal extends Classificacao {
	
	@Override
	public int getCodigoDePreco() {
		return NORMAL;
	}

	@Override
	public double getValorDoAluguel(int diasAlugado) {
		double valorDoAluguel = 2.0;
		if (diasAlugado > 2) {
			valorDoAluguel += (diasAlugado - 2) * 1.5;
		}
		return valorDoAluguel;
	}

}
