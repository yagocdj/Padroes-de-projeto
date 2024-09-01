package br.edu.ifpb.pps.mediator.chat;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpb.pps.mediator.user.User;

/**
 * Chat class that represents a chat in the system
 * and a concrete mediator of the Mediator pattern
 */
public class Chat implements ChatMediator {

    private List<User> users;

    public Chat() {
        this.users = new ArrayList<>();
    }

    /**
     * Add an user to the chat
     * 
     * @param user User to be added
     */
    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    /**
     * Send a message to all users in the chat except the sender
     * @param message Message to be sent
     * @param sender User that sent the message
     */
    @Override
    public void sendMessage(String message, User sender) {
        String currentUserName;
        for (User user : users) {

            currentUserName = user.getName();

            if (!currentUserName.equals(sender.getName())) {
                System.out.println(sender.getName() + " sent " +
                        "\"" + message + "\"" + " to you (" + currentUserName + ").");
            }
        }
    }
}
