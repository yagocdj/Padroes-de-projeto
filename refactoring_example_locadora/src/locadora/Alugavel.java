package locadora;

public interface Alugavel {
	public String getTitulo();
	public double getValorDoAluguel(int diasAlugado);
	public int getPontosDeAlugadorFrequente(int diasAlugado);
}
