package br.edu.ifpb.pps.factoryMethod.manager;

import br.edu.ifpb.pps.factoryMethod.notification.NotificationService;
import br.edu.ifpb.pps.factoryMethod.notification.PushNotification;

public class PushManager extends AbstractManager {

	@Override
	public NotificationService getService() {
		return new PushNotification();
	}
}
