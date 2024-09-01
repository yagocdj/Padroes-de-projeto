package br.edu.ifpb.pps.mediator.chat;

import br.edu.ifpb.pps.mediator.user.User;

public interface ChatMediator {
    
    public void sendMessage(String message, User sender);

    public void addUser(User user);
}
