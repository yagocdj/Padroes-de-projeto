package no.dependency.injection;

/**
 * Classe contém a lógica para enviar uma mensagem de e-mail para o endereço de e-mail do destinatário.
 * @author alexs
 *
 */
public class EmailService implements MessageService {
	
	@Override
	public void sendMessage(String message, String receiver){
		// Neste ponto teríamos a lógica (conjunto de instruções) para enviar um email
		System.out.println("Email sent to "+ receiver + " with Message=" + message);
	}
}
