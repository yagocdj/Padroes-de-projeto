package br.edu.ifpb.pps.social.networks;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpb.pps.iterator.LinkedInIterator;
import br.edu.ifpb.pps.iterator.ProfileIterator;
import br.edu.ifpb.pps.profile.Profile;

/**
 * Coleção concreta: Linkedin
 * @author alexs
 *
 */
public class LinkedIn implements SocialNetwork {
    private List<Profile> contacts;

    public LinkedIn(List<Profile> cache) {
        if (cache != null) {
            this.contacts = cache;
        } else {
            this.contacts = new ArrayList<>();
        }
    }

    /**
     * Método que recupera na coleção do LinkedIn, o Profile correspondente ao argumento
     * profileEmail
     * 
     * @param profileEmail
     * @return
     */
    public Profile requestContactInfoFromLinkedInAPI(String profileEmail) {
    	// Aqui teríamos o código de solicitação POST para um dos endpoints da API do LinkedIn.
        // Em vez disso, emulamos uma longa conexão de rede, o que você esperaria
        // na vida real..
        simulateNetworkLatency();
        System.out.println("LinkedIn.requestContactInfoFromLinkedInAPI():\nCarregando perfil '" + profileEmail + "' a partir da base de dados...");

        // ...and return test data.
        return findContact(profileEmail);
    }

    /**
     * Mètodo que retorna um List de "amigos/colegas" do usuario identificado por "profileEmail" 
     * @param profileEmail
     * @param contactType
     * @return
     */
    public List<String> requestRelatedContactsFromLinkedInAPI(String profileEmail, String contactType) {
    	// Aqui teríamos o código de solicitação POST para um dos endpoints da API do LinkedIn.
        // Em vez disso, emulamos uma longa conexão de rede, o que você esperaria
        // na vida real..
        simulateNetworkLatency();
        System.out.println("LinkedIn.requestRelatedContactsFromLinkedInAPI():\nCarregando lista de contatos ('" + contactType + "') de '" + profileEmail + "' a partir da base de dados...");

        // ...and return test data.
        Profile profile = findContact(profileEmail);
        if (profile != null) {
            return profile.getContacts(contactType);
        }
        return null;
    }

    private Profile findContact(String profileEmail) {
        for (Profile profile : contacts) {
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
        return new LinkedInIterator(this, "friends", profileEmail);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new LinkedInIterator(this, "coworkers", profileEmail);
    }
}
