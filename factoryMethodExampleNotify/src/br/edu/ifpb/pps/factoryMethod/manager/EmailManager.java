package br.edu.ifpb.pps.factoryMethod.manager;

import br.edu.ifpb.pps.factoryMethod.notification.EmailNotification;
import br.edu.ifpb.pps.factoryMethod.notification.NotificationService;

public class EmailManager extends AbstractManager {

	@Override
	public NotificationService getService() {
		return new EmailNotification();
	}
}
