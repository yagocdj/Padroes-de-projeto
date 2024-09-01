package br.edu.ifpb.pps.iterator;

public interface IterableList<T> {
	
	ListIterator<T> createNaturalOrderListIterator();
	ListIterator<T> createReverseOrderListIterator();
}
