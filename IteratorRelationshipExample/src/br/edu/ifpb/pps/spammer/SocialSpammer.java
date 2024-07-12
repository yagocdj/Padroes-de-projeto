package br.edu.ifpb.pps.spammer;

import br.edu.ifpb.pps.iterator.ProfileIterator;
import br.edu.ifpb.pps.profile.Profile;
import br.edu.ifpb.pps.social.networks.SocialNetwork;

/**
 * A classe SocialSpammer adota um truque útil: você pode passar um iterador
 * para uma classe cliente ao invés de dar acesso a ela à coleção completa. 
 * Dessa forma, você não expõe a coleção ao cliente.
 *
 * Temos também outro benefício: você pode mudar o modo que o cliente
 * trabalha com a coleção em tempo de execução ao passar a ele
 * um iterador diferente. Isso é possível porque o código cliente não está acoplado
 * às classes iterador concretas.
 * @author alexs
 *
 */
public class SocialSpammer {
    public SocialNetwork network;
    public ProfileIterator iterator;

    public SocialSpammer(SocialNetwork network) {
        this.network = network;
    }

    // Os métodos a seguir obtém os iteradores e os utilizam internamente.
    // Neste caso, os clientes que usam as redes sociais não terão acesso aos iteradores.
    // Apenas a ferramenta de spam lida diretamente com elas
    public void sendSpamToFriends(String profileEmail, String message) {
        System.out.println("\nIterarando na lista de amigos: \"friend\"...\n");
        iterator = network.createFriendsIterator(profileEmail);
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
    }

    public void sendSpamToCoworkers(String profileEmail, String message) {
        System.out.println("\nIterando na lista de colegas: \"coworkers\"...\n");
        iterator = network.createCoworkersIterator(profileEmail);
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
    }

    public void sendMessage(String email, String message) {
        System.out.println("Mensagem enviada para: '" + email + "'. Corpo da mensagem: '" + message + "'");
    }
}
