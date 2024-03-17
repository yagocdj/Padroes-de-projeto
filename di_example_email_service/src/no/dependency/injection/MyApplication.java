package no.dependency.injection;
/**
 * O código de cliente que usará a classe Application para enviar mensagens de e-mail será como abaixo.
 * @author alexs
 *
 */
public class MyApplication implements Consumer {
	// classe está responsável por criar e inicializar o serviço de e-mail, para posteriormente utilizá-lo.
	// Isso leva à "dependência codificada"
	private MessageService service;
	
	public MyApplication(MessageService service) {
		this.service = service;
	}
	
	@Override
	public void processMessages(String message, String receiver){
		//aqui teríamos algumas mensagens de validação, manipulação da lógica, etc.
		this.service.sendMessage(message, receiver);
	}
}
