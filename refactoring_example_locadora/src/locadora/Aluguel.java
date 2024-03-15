package locadora;

public class Aluguel {
	private Alugavel item;
	private int diasAlugado;

	public Aluguel(Alugavel item, int diasAlugado) {
		this.item = item;
		this.diasAlugado = diasAlugado;
	}

	// Eu poderia deixar o método em Cliente e delegar a lógica para o aluguel
	// (chamar o método calcularPrecoDoAluguel de aluguel)
	public double calcularPrecoDoAluguel() {
		return item.getValorDoAluguel(diasAlugado);
	}

	public int calcularPontosDeAlugadorFrequente() {
		return item.getPontosDeAlugadorFrequente(diasAlugado);
	}

	public Alugavel getAlugavel() {
		return item;
	}

	public int getDiasAlugado() {
		return diasAlugado;
	}
}
