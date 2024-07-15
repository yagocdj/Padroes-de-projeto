package br.edu.ifpb.pps.linkedList;

import br.edu.ifpb.pps.iterator.IterableList;
import br.edu.ifpb.pps.iterator.ListIterator;
import br.edu.ifpb.pps.iterator.NaturalOrderListIterator;
import br.edu.ifpb.pps.iterator.ReverseOrderListIterator;

public class MyLinkedList<T> implements IterableList {

	public Node<T> firstNode; // pointer to the first node
	public Node<T> lastNode; // pointer to the last node
	public String desc; // String used at the printing time

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
	public synchronized void pushToFront(T insertItem) {
		if (isEmpty())
			firstNode = lastNode = new Node<T>(insertItem);
		else
			firstNode = new Node<T>(insertItem, firstNode);
	}

	/**
	 * Inserts an object at the end of a list. Id the list is empty, both
	 * <code>firstNode</code> and <code>lastNode</code> will point to the same
	 * object. Otherwise, lastNode's next element points to the new Node.
	 * 
	 * @param insertItem - a generic object.
	 */
	public synchronized void pushToBack(T insertItem) {
		if (isEmpty())
			firstNode = lastNode = new Node<T>(insertItem);
		else
			lastNode = lastNode.next = new Node<T>(insertItem);
	}

	/**
	 * Removes the list's first node.
	 * 
	 * @return the removed element or null if no elements were found.
	 * @throws EmptyListException - when the list is empty.
	 */
	public synchronized T removeFromFront() throws EmptyListException {
		T removedItem = null;

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
	public synchronized T removeFromBack() throws EmptyListException {
		T removedItem = null;

		if (isEmpty())
			throw new EmptyListException(this.desc);

		removedItem = lastNode.load; // retrieves the data

		// resets the references to first and last nodes
		if (firstNode.equals(lastNode))
			firstNode = lastNode = null;
		else {
			Node<T> cursor = firstNode;

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
		Node<T> cursor = firstNode;
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
	public boolean findNode(T obj) {
		Node<T> cursor = this.firstNode;
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
	 * 
	 * @return the size of the list.
	 */
	public int size() {
		int size = 0;

		if (isEmpty())
			return size;

		Node<T> cursor = firstNode;

		while (cursor != null)
			size++;

		return size;
	}

	@Override
	public ListIterator<T> createNaturalOrderListIterator() {
		return new NaturalOrderListIterator<T>(this);
	}

	@Override
	public ListIterator<T> createReverseOrderListIterator() {
		return new ReverseOrderListIterator<T>(this);
	}
}
