package br.edu.ifpb.pps.mediator.user;

import br.edu.ifpb.pps.mediator.chat.ChatMediator;

/**
 * User class that represents a user in the chat
 * and a component of the Mediator pattern
 */
public class User {
    
    protected String name;
    protected ChatMediator chatMediator;

    public User(ChatMediator chatMediator, String name) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    /**
     * Send a message to the chat
     * @param message Message to be sent
     */
    public void sendMessage(String message) {
        System.out.println(this.name + " is sending a message");
        chatMediator.sendMessage(message, this);
    }

    public String getName() {
        return this.name;
    }

}
