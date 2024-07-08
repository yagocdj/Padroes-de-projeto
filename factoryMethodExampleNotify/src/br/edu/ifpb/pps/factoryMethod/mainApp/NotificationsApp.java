package br.edu.ifpb.pps.factoryMethod.mainApp;

import br.edu.ifpb.pps.factoryMethod.manager.AbstractManager;
import br.edu.ifpb.pps.factoryMethod.manager.EmailManager;
import br.edu.ifpb.pps.factoryMethod.manager.LetterManager;
import br.edu.ifpb.pps.factoryMethod.manager.PushManager;
import br.edu.ifpb.pps.factoryMethod.manager.SMSManager;
import br.edu.ifpb.pps.factoryMethod.user.User;

public class NotificationsApp {
	
	public static AbstractManager manager;

	public static void main(String[] args) {
		// Create a new user
		User user = new User("Yago", "yago@yago.com", "83911110000");
		
		initialize("email");  // choose the type here
		manager.send(user);
	}
	
	public static void initialize(String notificationType) {
		switch (notificationType) {
		case "email":
			manager = new EmailManager();
			break;
		case "letter":
			manager = new LetterManager();
			break;
		case "push":
			manager = new PushManager();
			break;
		case "sms":
			manager = new SMSManager();
			break;
		default:
			throw new IllegalArgumentException("Use a valid notification service!");
		}
	}

}
