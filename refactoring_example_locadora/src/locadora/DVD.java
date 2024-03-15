package locadora;

public class DVD implements Alugavel {

	public static final int NORMAL = 0;
	public static final int LANCAMENTO = 1;
	public static final int INFANTIL = 2;

	private String titulo;
	private Classificacao classificacao;

	public DVD(String titulo, int codigoDePreco) {
		this.titulo = titulo;
		setCodigoDePreco(codigoDePreco);
	}

	// Eu poderia deixar o método em Cliente e delegar a lógica para o aluguel
	// (chamar o método calcularPrecoDoAluguel de aluguel)

	// Pelo princípio do expert information, a responsabilidade de calcular o preço
	// deve ser de quem tem os dados

	// o aluguel tem o calcular preco do aluguel, mas ele passa
	public double getValorDoAluguel(int diasAlugado) {
		return classificacao.getValorDoAluguel(diasAlugado);
	}

	public int getPontosDeAlugadorFrequente(int diasAlugado) {
		// adiciona bonus para um aluguel de uma lançamento por pelo menos 2 dias
		return classificacao.getPontosDeAlugadorFrequente(diasAlugado);
	}

	public String getTitulo() {
		return titulo;
	}

	public int getCodigoDePreco() {
		return classificacao.getCodigoDePreco();
	}

	private void setCodigoDePreco(int codigoDePreco) {
		switch (codigoDePreco) {
		case NORMAL:
			classificacao = new DVDNormal();
			break;
		case LANCAMENTO:
			classificacao = new DVDLancamento();
			break;
		case INFANTIL:
			classificacao = new DVDInfantil();
			break;
		default:
			break;
		}
	}
}
