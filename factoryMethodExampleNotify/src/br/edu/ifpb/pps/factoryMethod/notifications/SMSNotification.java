package br.edu.ifpb.pps.factoryMethod.notifications;

import br.edu.ifpb.pps.factoryMethod.user.User;

public class SMSNotification implements NotificationService {

	@Override
	public void notify(User user) {
		System.out.printf("Enviando SMS para o telefone %s%n.", user.getPhoneNumber());
		
	}
	
}
