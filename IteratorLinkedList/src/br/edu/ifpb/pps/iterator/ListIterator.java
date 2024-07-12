package br.edu.ifpb.pps.iterator;

import br.edu.ifpb.pps.linkedList.Node;

public interface ListIterator {
	
	Node getNext();
	boolean hasNext();
	void reset();
}
