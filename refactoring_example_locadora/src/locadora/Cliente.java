package locadora;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nome;
	private List<Aluguel> dvdsAlugados = new ArrayList<Aluguel>();

	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void adicionaAluguel(Aluguel aluguel) {
		dvdsAlugados.add(aluguel);
	}
	
	public String extratoHTML() {
		return new ExtratoHTML().gerarExtrato(this);
	}

	public String extrato() {
		return new ExtratoTextoPuro().gerarExtrato(this);
	}

	// Os LOOPS extras a seguir compensam A DEPENDER DA SITUAÇÃO
	// Se tiver uma grande quantidade de clientes demandando o recurso, ISSO PODE AFETAR
	public double getValorTotalDoAluguel() {
		double valorTotal = 0.0;
		for (Aluguel aluguelCorrente : dvdsAlugados)
			valorTotal += aluguelCorrente.calcularPrecoDoAluguel();
		return valorTotal;
	}

	public int getTotalDePontosDeAlugadorFrequente() {
		int totalDePontos = 0;
		for (Aluguel aluguelCorrente : dvdsAlugados)
			totalDePontos += aluguelCorrente.calcularPontosDeAlugadorFrequente();
		return totalDePontos;
	}
	
	public List<Aluguel> getDvdsAlugados() {
		return new ArrayList<>(this.dvdsAlugados);
	}

}