package br.edu.ifpb.pps.dependencyinjection.injector;

import br.edu.ifpb.pps.dependencyinjection.consumer.Consumer;
import br.edu.ifpb.pps.dependencyinjection.consumer.MyApplication;
import br.edu.ifpb.pps.dependencyinjection.service.SMSService;

public class SMSServiceInjector implements MessageServiceInjector {
	
	@Override
	public Consumer getConsumer() {
		return new MyApplication(new SMSService());
	}
}
