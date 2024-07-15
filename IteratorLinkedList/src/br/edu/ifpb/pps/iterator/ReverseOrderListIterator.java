package br.edu.ifpb.pps.iterator;

import br.edu.ifpb.pps.linkedList.EmptyListException;
import br.edu.ifpb.pps.linkedList.MyLinkedList;
import br.edu.ifpb.pps.linkedList.Node;

public class ReverseOrderListIterator<T> implements ListIterator<T> {

	private MyLinkedList<T> collection;
	private MyLinkedList<T> stack;

	public ReverseOrderListIterator(MyLinkedList<T> collection) {
		this.collection = collection;
		this.stack = new MyLinkedList<T>();

		fillStack();
	}

	@Override
	public T getNext() {
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
		Node<T> cursor = collection.firstNode;
		while (cursor != null) {
			stack.pushToBack(cursor.load);
			cursor = cursor.next;
		}

	}

}
