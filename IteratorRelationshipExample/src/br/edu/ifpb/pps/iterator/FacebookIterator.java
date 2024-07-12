package br.edu.ifpb.pps.iterator;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpb.pps.profile.Profile;
import br.edu.ifpb.pps.social.networks.Facebook;

/**
 * Implementa iteração nos perfis do Facebook
 * @author alexs
 *
 */
public class FacebookIterator implements ProfileIterator {

    private Facebook facebook;
    private String type;
    private String email;
    // Um objeto iterador percorre a coleção independentemente de outros iteradores. 
    // Portanto ele tem que armazenar o estado da iteração.
    private int currentPosition = 0;
    
    private List<String> emails = new ArrayList<>();
    private List<Profile> profiles = new ArrayList<>();

    public FacebookIterator(Facebook facebook, String type, String email) {
        this.facebook = facebook;
        this.type = type;
        this.email = email;
    }

    /**
     * Carregamento "preguiçosa": só faz o trabalho na primeira vez que for solicitado.
     * Este método repera a lista de amigos/colega de um usuário específico e adiciona na colecao 
     * de emails. A colecao  
     */
    private void lazyLoad() {
        if (emails.size() == 0) {
            List<String> profiles = facebook.requestProfileFriendsFromFacebook(this.email, this.type);
            for (String profile : profiles) {
                this.emails.add(profile);
                this.profiles.add(null);
            }
        }
    }

    @Override
    public boolean hasNext() {
        lazyLoad();
        return currentPosition < emails.size();
    }

    @Override
    public Profile getNext() {
        if (!hasNext()) {
            return null;
        }

        // Recupera o email que é chave para localização de um Profile
        String friendEmail = emails.get(currentPosition);
        // Obtem o objeto Profile a partir do currentPosition
        Profile friendProfile = profiles.get(currentPosition);
        // Se o profile retornal null, tem que carregá-lo.
        if (friendProfile == null) {
            friendProfile = facebook.requestProfileFromFacebook(friendEmail);
            profiles.set(currentPosition, friendProfile);
        }
        currentPosition++;
        return friendProfile;
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }

}