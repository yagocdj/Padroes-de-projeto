import br.edu.ifpb.pps.mediator.chat.Chat;
import br.edu.ifpb.pps.mediator.chat.ChatMediator;
import br.edu.ifpb.pps.mediator.user.User;


/**
 * Main class of the Mediator pattern example
 */
public class App {
    public static void main(String[] args) throws Exception {

        var receivers = new String[] { "Marcela", "Renato", "Olívia", "Pablo", "Júlia" };
        
        ChatMediator chatMediator = new Chat();

        // User component (sender)
        User sender = new User(chatMediator, "Yago");

        chatMediator.addUser(sender);
        
        // User components (receivers)
        for (String receiver : receivers) {
            chatMediator.addUser(new User(chatMediator, receiver));
        }

        // Send a message to all users in the chat
        chatMediator.sendMessage("Bom dia, meus corações", sender);

    }
}
