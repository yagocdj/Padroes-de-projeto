package br.edu.ifpb.pps.factoryMethod.notification;

import br.edu.ifpb.pps.factoryMethod.user.User;

public class PushNotification implements NotificationService {

	@Override
	public void sendNotification(User user) {
		System.out.printf("Enviando notificação push para %s%n", user.getName());
	}
}
