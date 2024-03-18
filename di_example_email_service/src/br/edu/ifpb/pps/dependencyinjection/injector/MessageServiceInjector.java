package br.edu.ifpb.pps.dependencyinjection.injector;

import br.edu.ifpb.pps.dependencyinjection.consumer.Consumer;

public interface MessageServiceInjector {
	
	public Consumer getConsumer();
}
