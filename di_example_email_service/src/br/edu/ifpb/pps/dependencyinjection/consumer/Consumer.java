package br.edu.ifpb.pps.dependencyinjection.consumer;

public interface Consumer {
	
	void processMessages(String message, String receiver);
}
