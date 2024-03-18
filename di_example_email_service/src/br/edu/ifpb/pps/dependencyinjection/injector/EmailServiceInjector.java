package br.edu.ifpb.pps.dependencyinjection.injector;

import br.edu.ifpb.pps.dependencyinjection.consumer.Consumer;
import br.edu.ifpb.pps.dependencyinjection.consumer.MyApplication;
import br.edu.ifpb.pps.dependencyinjection.service.EmailService;

public class EmailServiceInjector implements MessageServiceInjector {
	
	@Override
	public Consumer getConsumer() {
		return new MyApplication(new EmailService());
	}
}
