package br.edu.ifpb.pps.factoryMethod.manager;

import br.edu.ifpb.pps.factoryMethod.notification.NotificationService;
import br.edu.ifpb.pps.factoryMethod.user.User;

public abstract class AbstractManager {

	public final void send(User user) {
		NotificationService notificationService = this.getService();
		notificationService.sendNotification(user);
	}
	
	abstract NotificationService getService();
}
