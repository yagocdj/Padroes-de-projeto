package br.edu.ifpb.pps.iterator;

import br.edu.ifpb.pps.linkedList.MyLinkedList;
import br.edu.ifpb.pps.linkedList.MyLinkedList.EmptyListException;
import br.edu.ifpb.pps.linkedList.Node;

public class ReverseOrderListIterator implements ListIterator {

	private MyLinkedList collection;
	private MyLinkedList stack;

	public ReverseOrderListIterator(MyLinkedList collection) {
		this.collection = collection;
		this.stack = new MyLinkedList();

		fillStack();
	}

	@Override
	public Object getNext() {
		try {
			return stack.removeFromBack();
		} catch (EmptyListException elex) {
			return null;
		}
	}

	@Override
	public boolean hasNext() {
		return !stack.isEmpty();
	}

	@Override
	public void reset() {
		fillStack();
	}

	private void fillStack() {
		Node cursor = collection.firstNode;
		while (cursor != null) {
			stack.pushToBack(cursor.load);
			cursor = cursor.next;
		}
		
	}

}
