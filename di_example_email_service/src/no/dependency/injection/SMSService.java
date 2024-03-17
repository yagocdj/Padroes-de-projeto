package no.dependency.injection;

/**
 * Classe que contem a lógica responsável por enviar um SMS para o celular do destinatário.
 * @author yago
 */
public class SMSService implements MessageService {
	
	@Override
	public void sendMessage(String message, String cellphone) {
		// Lógica para o envio de mensagens SMS
		System.out.println("SMS sent to "+ cellphone + " with Message=" + message);
	}
}
