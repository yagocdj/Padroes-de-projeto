package no.dependency.injection;

public class EmailServiceInjector implements MessageServiceInjector {
	
	@Override
	public Consumer getConsumer() {
		return new MyApplication(new EmailService());
	}
}
