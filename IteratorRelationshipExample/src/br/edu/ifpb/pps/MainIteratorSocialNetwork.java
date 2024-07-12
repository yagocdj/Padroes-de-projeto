package br.edu.ifpb.pps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.ifpb.pps.profile.Profile;
import br.edu.ifpb.pps.social.networks.Facebook;
import br.edu.ifpb.pps.social.networks.LinkedIn;
import br.edu.ifpb.pps.social.networks.SocialNetwork;
import br.edu.ifpb.pps.spammer.SocialSpammer;

public class MainIteratorSocialNetwork {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe a rede social Please a qual deseja executar a ferramenta de spam (default:Facebook):");
        System.out.println("1. Facebook");
        System.out.println("2. LinkedIn");
        String choice = scanner.nextLine();

        
        // Criando o objeto "RedeSocial" correspondente
        SocialNetwork network;
        if (choice.equals("2")) {
            network = new LinkedIn(createTestProfiles());
        }
        else {
            network = new Facebook(createTestProfiles());
        }

        // Instanciando a ferramenta de envio de spam, passando a rede social como parâmetro
        SocialSpammer spammer = new SocialSpammer(network);
        spammer.sendSpamToFriends("anna.smith@bing.com",
                "Ola! Sou Anna, amiga de Josh. Pode me fazer o favor de deixar o like no post [link]?");
        spammer.sendSpamToCoworkers("anna.smith@bing.com",
                "Ola! Sou Jason, chefe de Anna. Anna me disse que voce esta interessado(a) em se inscreve no site [link].");
    }

    /**
     * Método de povoamento automático das redes sociais
     * @return
     */
    public static List<Profile> createTestProfiles() {
        List<Profile> data = new ArrayList<Profile>();
        data.add(new Profile("anna.smith@bing.com", "Anna Smith", "friends:mad_max@ya.com", "friends:catwoman@yahoo.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("mad_max@ya.com", "Maximilian", "friends:anna.smith@bing.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("bill@microsoft.eu", "Billie", "coworkers:avanger@ukr.net"));
        data.add(new Profile("avanger@ukr.net", "John Day", "coworkers:bill@microsoft.eu"));
        data.add(new Profile("sam@amazon.com", "Sam Kitting", "coworkers:anna.smith@bing.com", "coworkers:mad_max@ya.com", "friends:catwoman@yahoo.com"));
        data.add(new Profile("catwoman@yahoo.com", "Liza", "friends:anna.smith@bing.com", "friends:sam@amazon.com"));
        return data;
    }
}
