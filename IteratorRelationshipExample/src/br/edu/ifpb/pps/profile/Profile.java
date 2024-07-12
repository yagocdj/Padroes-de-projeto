package br.edu.ifpb.pps.profile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Perfis sociais
 * @author alexs
 *
 */
public class Profile {
    private String name;
    private String email;
    // mapa com as chaves "friends" e "coworkers" e suas respectivas listas de contatos
    private Map<String, List<String>> contacts = new HashMap<>();

    // Construtor que recebe as informações do proprietário do perfil e
    // uma lista de contatos. Os contatos já vem rotulados como "friends" ou
    // "coworkers", no seguinte padrão:
    // "friends:damires@ifpb.edu.br"
    // "coworkers:luiz.chaves@ifpb.edu.br"
    public Profile(String email, String name, String... contacts) {
        this.email = email;
        this.name = name;

        // Parse a lista de contatos a partir de uma relação de pares "friend:email@gmail.com".
        for (String contact : contacts) {
            String[] parts = contact.split(":");
            String contactType = "friend", contactEmail;
            if (parts.length == 1) {
                contactEmail = parts[0];
            }
            else {
                contactType = parts[0];
                contactEmail = parts[1];
            }
            if (!this.contacts.containsKey(contactType)) {
                this.contacts.put(contactType, new ArrayList<>());
            }
            this.contacts.get(contactType).add(contactEmail);
        }
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public List<String> getContacts(String contactType) {
        if (!this.contacts.containsKey(contactType)) {
            this.contacts.put(contactType, new ArrayList<>());
        }
        return contacts.get(contactType);
    }
}
