package locadora;

public class ExtratoHTML extends Extrato {

	@Override
	public String formatarCabecalho(String nomeCliente, String fimDeLinha) {
		return"<h1>Registro de alugueis de <em>" + nomeCliente + "</em></h1>" +
			  "<p>" + fimDeLinha;
	}

	@Override
	public String formatarCorpo(Aluguel aluguel, String fimDeLinha) {
		return aluguel.getAlugavel().getTitulo() + ": R$ " +
			     aluguel.calcularPrecoDoAluguel() + "</br>"+ fimDeLinha;
	}

	@Override
	public String formatarRodape(Cliente cliente, String fimDeLinha) {
		return "</p>" +
			   "<p>" +
			      "Valor total pago: <em>R$" + cliente.getValorTotalDoAluguel() + "</em>" +
			   "</p>" + fimDeLinha +
			   "<p>" +
			     "Voce acumulou <em>" + cliente.getTotalDePontosDeAlugadorFrequente() +
				 " pontos </em> de alugador frequente" +
			   "</p>";
	}

}
