package br.edu.ifpb.pps.iterator;

import br.edu.ifpb.pps.linkedList.MyLinkedList;
import br.edu.ifpb.pps.linkedList.Node;

public class NaturalOrderListIterator implements ListIterator {
	
	// TODO - a good addition would be to insert an integer index
	private MyLinkedList collection;
	private Node currentPosition = collection.firstNode;
	
	public NaturalOrderListIterator(MyLinkedList collection) {
		this.collection = collection;
	}

	@Override
	public Node getNext() {
		if (!hasNext())
			return null;
		
		return currentPosition.next;
	}

	@Override
	public boolean hasNext() {
		return currentPosition.next != null;
	}

	@Override
	public void reset() {
		currentPosition = collection.firstNode;
	}

}
