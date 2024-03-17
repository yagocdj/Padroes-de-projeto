package no.dependency.injection;

public class ClientTest {
//	public static void main(String[] args) {
//		MyApplication app = new MyApplication();
//		app.processMessages("Ola Alex! Mostra um exemplo de DI.", "alex@ifpb.edu.br");
//	}
	
	public static void main(String[] args) {
		String menssage = "Ola Alex! Mostra um exemplo de DI/";
		String email = "alex@ifpb.edu.br";
		String phone = "83995955959";
		
		// Declarando o injetor de dependência para a classe consumidora
		MessageServiceInjector injector = null;
		Consumer app;
		
		// Enviando mensagem por email: criando o injetor concreto de
		// serviço por email
		injector = new EmailServiceInjector();
		app = injector.getConsumer(); // Obtendo um consumidor compatível (criando uma app com um serviço de email injetado)
		app.processMessages(menssage, email); // Envia a mensagem por email
		
		// Enviando mensagem por SMS: criando o injetor concreto
		injector = new SMSServiceInjector();
		app = injector.getConsumer(); // app com serviço de SMS injetado
		app.processMessages(menssage, phone);  // enviando mensagem via SMS (passando o telefone)
	}
}
