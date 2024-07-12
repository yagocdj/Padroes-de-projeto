package br.edu.ifpb.pps.iterator;

public interface IterableList {
	
	ListIterator createNaturalOrderListIterator();
	ListIterator createReverseOrderListIterator();
}
