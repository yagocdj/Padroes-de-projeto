package br.edu.ifpb.pps.linkedList;

import br.edu.ifpb.pps.iterator.IterableList;
import br.edu.ifpb.pps.iterator.ListIterator;
import br.edu.ifpb.pps.iterator.NaturalOrderListIterator;

public class MyLinkedList implements IterableList {

	public Node firstNode; // pointer to the first node
	public Node lastNode; // pointer to the last node
	public String desc; // String used at the printing time
	
	public class EmptyListException extends Exception {
		private static final long serialVersionUID = 1L;

		public EmptyListException(String errorMessage) {
			super(errorMessage);
		}
	}

	/**
	 * Creates an empty list with "s" as a description
	 * 
	 * @param s - the list's description.
	 */
	public MyLinkedList(String s) {
		this.desc = s;
		firstNode = lastNode = null;
	}

	/**
	 * Creates an empty list with "Unknown" as name.
	 */
	public MyLinkedList() {
		this("Unknown");
	}

	/**
	 * Returns if the list is empty.
	 * 
	 * @return <code>true</code> if the list is empty. Otherwise, it returns
	 *         <code>false</code>.
	 */
	public synchronized boolean isEmpty() {
		return firstNode == null;
	}

	/**
	 * Inserts an object at the beginning of a list. If the list is empty, both
	 * <code>firstNode</code> and <code>lastNode</code> will point to the same
	 * object. Otherwise, <code>firstNode</code> points to the new Node.
	 * 
	 * @param insertItem - a generic object.
	 */
	public synchronized void pushToFront(Object insertItem) {
		if (isEmpty())
			firstNode = lastNode = new Node(insertItem);
		else
			firstNode = new Node(insertItem, firstNode);
	}

	/**
	 * Inserts an object at the end of a list. Id the list is empty, both
	 * <code>firstNode</code> and <code>lastNode</code> will point to the same
	 * object. Otherwise, lastNode's next element points to the new Node.
	 * 
	 * @param insertItem - a generic object.
	 */
	public synchronized void pushToBack(Object insertItem) {
		if (isEmpty())
			firstNode = lastNode = new Node(insertItem);
		else
			lastNode = lastNode.next = new Node(insertItem);
	}

	/**
	 * Removes the list's first node.
	 * 
	 * @return the removed element or null if no elements were found.
	 * @throws EmptyListException - when the list is empty.
	 */
	public synchronized Object removeFromFront() throws EmptyListException {
		Object removedItem = null;

		if (isEmpty())
			throw new EmptyListException(this.desc);

		removedItem = firstNode.load; // retrieve the data

		// redefine firstNode and lastNode's references
		if (firstNode.equals(lastNode))
			firstNode = lastNode = null;
		else
			firstNode = firstNode.next;

		return removedItem;
	}

	/**
	 * Removes the list's last node.
	 * 
	 * @return the removed element or null if no elements were found.
	 * @throws EmptyListException - when the list is empty.
	 */
	public synchronized Object removeFromBack() throws EmptyListException {
		Object removedItem = null;

		if (isEmpty())
			throw new EmptyListException(this.desc);

		removedItem = lastNode.load; // retrieves the data

		// resets the references to first and last nodes
		if (firstNode.equals(lastNode))
			firstNode = lastNode = null;
		else {
			Node cursor = firstNode;

			while (cursor.next != lastNode) // is not equal to the last node
				cursor = cursor.next; // goes to the next node

			lastNode = cursor;
			cursor.next = null;
		}

		return removedItem;
	}

	/**
	 * Shows the list's content.
	 */
	public synchronized String toString() {
		Node cursor = firstNode;
		String ret = "";

		if (isEmpty()) {
			return ("{}");
		}

		// ret += "A " + this.nome + " �: \n";

		while (cursor != null) {
			ret += cursor.load.toString() + "\n";
			cursor = cursor.next;
		}

		return ret;
	}

	/**
	 * Looks for the node's first occurrence.
	 * 
	 * @param obj - a generic object.
	 * @return <code>true</code> if the searched value was found. Otherwise, it
	 *         returns <code>false</code>.
	 */
	public boolean findNode(Object obj) {
		Node cursor = this.firstNode;
		boolean found = false;

		while (cursor != null) {
			if (cursor.load.equals(obj)) {
				found = true;
				break;
			} else
				cursor = cursor.next;
		}
		return (found);
	}
	
	/**
	 * Calculates list's size.
	 * @return the size of the list.
	 */
	public int size() {
		int size = 0;
		
		if (isEmpty())
			return size;
		
		Node cursor = firstNode;
		
		while (cursor != null)
			size++;
		
		return size;
	}

	@Override
	public ListIterator createNaturalOrderListIterator() {
		return new NaturalOrderListIterator(this);
	}

	@Override
	public ListIterator createReverseOrderListIterator() {
		return null;
	}
}
