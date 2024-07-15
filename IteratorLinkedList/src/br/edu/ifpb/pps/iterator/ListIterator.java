package br.edu.ifpb.pps.iterator;

public interface ListIterator<T> {

	T getNext();

	boolean hasNext();

	void reset();
}
