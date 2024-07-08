package br.edu.ifpb.pps.factoryMethod.notification;

import br.edu.ifpb.pps.factoryMethod.user.User;

public class SMSNotification implements NotificationService {

	@Override
	public void sendNotification(User user) {
		System.out.printf("Enviando SMS para o telefone %s%n.", user.getPhoneNumber());
		
	}
	
}
