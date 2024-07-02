package br.edu.ifpb.pps.factoryMethod.manager;

import br.edu.ifpb.pps.factoryMethod.notification.NotificationService;
import br.edu.ifpb.pps.factoryMethod.notification.SMSNotification;

public class SMSManager extends AbstractManager {

	@Override
	public NotificationService getService() {
		return new SMSNotification();
	}
}
