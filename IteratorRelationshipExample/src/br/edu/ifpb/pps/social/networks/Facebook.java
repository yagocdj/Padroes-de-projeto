package br.edu.ifpb.pps.social.networks;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpb.pps.iterator.FacebookIterator;
import br.edu.ifpb.pps.iterator.ProfileIterator;
import br.edu.ifpb.pps.profile.Profile;

/**
 * Coleção concreta: Facebook.
 * 
 * Cada coleção concreta é acoplada a um conjunto de classes iterador concretas que ela retorna. 
 * Mas o cliente não é, uma vez que a assinatura desses métodos retorna interfaces de
 * iterador (ProfileIterator).
 * 
 * @author alexs
 *
 */
public class Facebook implements SocialNetwork {
    private List<Profile> profiles;

    public Facebook(List<Profile> cache) {
        if (cache != null) {
            this.profiles = cache;
        } else {
            this.profiles = new ArrayList<>();
        }
    }

    /**
     * Método que recupera na coleção do Facebook, o Profile correspondente ao argumento
     * profileEmail
     * 
     * @param profileEmail
     * @return
     */
    public Profile requestProfileFromFacebook(String profileEmail) {
    	// Aqui teríamos o código de solicitação POST para um dos endpoints da API do Facebook.
        // Em vez disso, emulamos uma longa conexão de rede, o que você esperaria
        // na vida real...
        simulateNetworkLatency();
        System.out.println("Facebook.requestProfileFromFacebook():\nCarregando perfil '" + profileEmail + "' a partir da base de dados...");

        return findProfile(profileEmail);
    }

    /**
     * Mètodo que retorna um List de "amigos/colegas" do usuario identificado por "profileEmail" 
     * @param profileEmail
     * @param contactType
     * @return
     */
    public List<String> requestProfileFriendsFromFacebook(String profileEmail, String contactType) {
    	// Aqui teríamos o código de solicitação POST para um dos endpoints da API do Facebook.
        // Em vez disso, emulamos uma longa conexão de rede, o que você esperaria
        // na vida real..
        simulateNetworkLatency();
        System.out.println("Facebook.requestProfileFriendsFromFacebook():\nCarregando lista de contatos ('" + contactType + "') de '" + profileEmail + "' a partir da base de dados...");

        // ...and return test data.
        Profile profile = findProfile(profileEmail);
        if (profile != null) {
            return profile.getContacts(contactType);
        }
        return null;
    }

    /**
     * Retorna o objeto Profile referente ao argumento "profileEmail"
     * @param profileEmail
     * @return
     */
    private Profile findProfile(String profileEmail) {
        for (Profile profile : profiles) {
            if (profile.getEmail().equals(profileEmail)) {
                return profile;
            }
        }
        return null;
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileEmail) {
        return new FacebookIterator(this, "friends", profileEmail);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new FacebookIterator(this, "coworkers", profileEmail);
    }

}
