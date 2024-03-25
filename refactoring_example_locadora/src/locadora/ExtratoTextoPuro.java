package locadora;

public class ExtratoTextoPuro extends Extrato {

	@Override
	public String formatarCabecalho(String nomeCliente, String fimDeLinha) {
		return "Registro de Alugueis de " + nomeCliente + fimDeLinha;
	}

	@Override
	public String formatarCorpo(Aluguel aluguel, String fimDeLinha) {
		return "\t" + aluguel.getAlugavel().getTitulo() + "\t R$ "
				+ aluguel.calcularPrecoDoAluguel() + fimDeLinha;
	}

	@Override
	public String formatarRodape(Cliente cliente, String fimDeLinha) {
		return "Valor total pago: R$ " + cliente.getValorTotalDoAluguel() + fimDeLinha +
	           "Voce acumulou " + cliente.getTotalDePontosDeAlugadorFrequente() +
	           " pontos de alugador frequente";
	}

}
