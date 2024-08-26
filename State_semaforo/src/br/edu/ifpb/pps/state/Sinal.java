package br.edu.ifpb.pps.state;


public enum Sinal {
    VERMELHO("PARE"),
    AMARELO("ATENCAO"),
    VERDE("SIGA");
	
	private String acao;
	
	// enum constructor - cannot be public or protected
    private Sinal(String acao)
    {
        this.acao = acao;
    }
	
	public String getAcao() {
		return this.acao;
	}
}
