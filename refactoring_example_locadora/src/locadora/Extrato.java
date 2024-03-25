package locadora;

import java.util.List;

public abstract class Extrato {
	
	public final String gerarExtrato(Cliente cliente) {
		final String fimDeLinha = System.getProperty("line.separator");
		List<Aluguel> alugueis = cliente.getDvdsAlugados();
		String texto = formatarCabecalho(fimDeLinha, cliente.getNome());

		// mostrar valores para os alugueis
		texto += formatarCorpoComBaseNosAlugueis(alugueis, fimDeLinha);
		// adiciona rodapé
		texto += formatarRodape(cliente, fimDeLinha);

		return texto;
	}
	
	private String formatarCorpoComBaseNosAlugueis(List<Aluguel> alugueis, String fimDeLinha) {
		String texto = "";
		for (Aluguel aluguel : alugueis)
			// mostra valores para este aluguel
			texto += formatarCorpo(aluguel, fimDeLinha);
		return texto;
	}
	
	public abstract String formatarCabecalho(String nomeCliente, String fimDeLinha);

	public abstract String formatarCorpo(Aluguel aluguel, String fimDeLinha);
	
	public abstract String formatarRodape(Cliente cliente, String fimDeLinha);
	
}
