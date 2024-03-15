package locadora;

import java.util.ArrayList;
import java.util.Iterator;
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
		final String fimDeLinha = System.getProperty("line.separator");
		
		Iterator<Aluguel> alugueis = dvdsAlugados.iterator();
		String resultado = "<h1>Registro de alugueis de <em>" + getNome() +
				"</em></h1><p>" + fimDeLinha;
		
		while (alugueis.hasNext()) {
			Aluguel aluguelCorrente = alugueis.next();
			
			// mostra valores para este aluguel
			resultado += aluguelCorrente.getAlugavel().getTitulo() + ": R$ " +
					     aluguelCorrente.calcularPrecoDoAluguel() + "</br>"+ fimDeLinha;
		}
		
		// adiciona rodapé
		resultado += "</p><p>Valor total pago: <em>R$" + getValorTotalDoAluguel() +
					 "</em></p>" + fimDeLinha;
		resultado += "<p>Voce acumulou <em>" +
				getTotalDePontosDeAlugadorFrequente() +
				" pontos </em> de alugador frequente</p>";
		
		return resultado;
	}

	public String extrato() {
		final String fimDeLinha = System.getProperty("line.separator");

		Iterator<Aluguel> alugueis = dvdsAlugados.iterator();
		String resultado = "Registro de Alugueis de " + getNome() + fimDeLinha;

		while (alugueis.hasNext()) {
			Aluguel aluguelCorrente = alugueis.next();

			// mostra valores para este aluguel
			resultado += "\t" + aluguelCorrente.getAlugavel().getTitulo() + "\t R$ "
					+ aluguelCorrente.calcularPrecoDoAluguel() + fimDeLinha;
		}

		// adiciona rodapé
		resultado += "Valor total pago: R$ " + getValorTotalDoAluguel() + fimDeLinha;
		resultado += "Voce acumulou " + getTotalDePontosDeAlugadorFrequente() + " pontos de alugador frequente";

		return resultado;
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

}