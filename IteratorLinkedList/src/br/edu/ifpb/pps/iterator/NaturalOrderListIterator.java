package br.edu.ifpb.pps.iterator;

import br.edu.ifpb.pps.linkedList.MyLinkedList;
import br.edu.ifpb.pps.linkedList.Node;

public class NaturalOrderListIterator implements ListIterator {
	
	// TODO - a good addition would be to insert an integer index
	private MyLinkedList collection;
	private Node currentPosition;
	
	public NaturalOrderListIterator(MyLinkedList collection) {
		this.collection = collection;
		this.currentPosition = collection.firstNode;
	}

	@Override
	public Object getNext() {
		if (!hasNext())
			return null;
		
		Object currentNodeLoad = currentPosition.getObject();
		currentPosition = currentPosition.getNext();
		
		return currentNodeLoad;
	}

	@Override
	public boolean hasNext() {
		return currentPosition != null;
	}

	@Override
	public void reset() {
		currentPosition = collection.firstNode;
	}

}
