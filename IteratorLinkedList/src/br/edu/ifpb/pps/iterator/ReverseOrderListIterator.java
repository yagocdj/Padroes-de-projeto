package br.edu.ifpb.pps.iterator;

import br.edu.ifpb.pps.linkedList.MyLinkedList;
import br.edu.ifpb.pps.linkedList.Node;

public class ReverseOrderListIterator implements ListIterator {
	
	private MyLinkedList collection;
	private MyLinkedList auxCollection;
	private Node currentPosition = collection.lastNode;
	
	public ReverseOrderListIterator(MyLinkedList collection) {
		this.collection = collection;
		
	}
	
	@Override
	public Node getNext() {
		ListIterator it = collection.createNaturalOrderListIterator();
		
		while (it.hasNext()) {
			auxCollection.pushToBack(it.getNext().load);
		}
		
		if (!hasNext())
			return null;
		
		return null;
		
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}

}
