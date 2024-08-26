package br.edu.ifpb.pps.state;


public class Main {

	public static void main(String[] args) {
		Sinal estado = Sinal.VERMELHO;
		System.out.println(estado.getAcao());
		
		Semaforo epitacio = new Semaforo("12356");
		System.out.println("Estado Atual: " + epitacio.getEstadoAtual());
		System.out.println("Significado : " + epitacio.getEstadoAtual().getAcao());
		//epitacio.exibir();
		
		epitacio.start();
		
		System.out.println("Fim da simulacao.");
		
		System.out.println(epitacio);
				

	}

}
