package br.edu.ifpb.pps.factoryMethod.notification;

import br.edu.ifpb.pps.factoryMethod.user.User;

public class LetterNotification implements NotificationService {

	@Override
	public void sendNotification(User user) {
		System.out.printf("Enviando uma carta para %s%n", user.getName());
	}
	
}
