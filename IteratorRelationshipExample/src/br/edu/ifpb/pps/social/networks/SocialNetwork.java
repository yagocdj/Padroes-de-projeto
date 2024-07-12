package br.edu.ifpb.pps.social.networks;

import br.edu.ifpb.pps.iterator.ProfileIterator;

/**
 * Interface que representa o papal do "IterableCollection" do gabarito Iterator
 *
 * A interface da coleção deve declarar um método fábrica para produzir iteradores. 
 * Você pode declarar vários métodos se houver diferentes tipos de iteração disponíveis
 * em seu programa.
 * @author alexs
 *
 */
public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);
    ProfileIterator createCoworkersIterator(String profileEmail);
}
