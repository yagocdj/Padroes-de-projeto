package br.edu.ifpb.pps.factoryMethod.manager;

import br.edu.ifpb.pps.factoryMethod.notification.LetterNotification;
import br.edu.ifpb.pps.factoryMethod.notification.NotificationService;

public class LetterManager extends AbstractManager {

	@Override
	NotificationService getService() {
		return new LetterNotification();
	}
	
}
