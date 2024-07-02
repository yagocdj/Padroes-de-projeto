package br.edu.ifpb.pps.factoryMethod.notification;

import br.edu.ifpb.pps.factoryMethod.user.User;

public class EmailNotification implements NotificationService {
	
	@Override
	public void notify(User user) {
		
		if (!validateUser(user)) {
			System.out.println("Email inválido.");
			return;
		}
		
		System.out.printf("Enviando notificação para o e-mail %s%n", user.getEmail());
	}
	
	private boolean validateUser(User user) {
		String email = user.getEmail();
		return !email.isEmpty() && !email.isBlank();
		// TODO - use a regular expression to properly validate the user's email
	}
}
