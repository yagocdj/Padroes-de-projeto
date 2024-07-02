package br.edu.ifpb.pps.factoryMethod.notifications;

import br.edu.ifpb.pps.factoryMethod.user.User;

public class PushNotification implements NotificationService {

	@Override
	public void notify(User user) {
		System.out.printf("Enviando notificação push para %s%n", user.getName());
	}
}
