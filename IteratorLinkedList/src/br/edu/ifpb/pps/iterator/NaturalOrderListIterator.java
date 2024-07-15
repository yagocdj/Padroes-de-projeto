package br.edu.ifpb.pps.iterator;

import br.edu.ifpb.pps.linkedList.MyLinkedList;
import br.edu.ifpb.pps.linkedList.Node;

public class NaturalOrderListIterator<T> implements ListIterator<T> {

	// TODO - a good addition would be to insert an integer index
	private MyLinkedList<T> collection;
	private Node<T> currentPosition;

	public NaturalOrderListIterator(MyLinkedList<T> collection) {
		this.collection = collection;
		this.currentPosition = collection.firstNode;
	}

	@Override
	public T getNext() {
		if (!hasNext())
			return null;

		T currentNodeLoad = currentPosition.getLoad();
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
