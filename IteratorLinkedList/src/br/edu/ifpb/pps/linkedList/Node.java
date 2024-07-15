package br.edu.ifpb.pps.linkedList;

public class Node<T> {

	public T load;
	public Node<T> next;

	/**
	 * Creates a node that references an object.
	 * 
	 * @param obj - a generic object.
	 */
	public Node(T obj) {
		this(obj, null);
	}

	/**
	 * Creates a node that references an object and the list's next node.
	 * 
	 * @param obj      - a generic object.
	 * @param nextNode - pointer to the list's next node.
	 */
	public Node(T obj, Node<T> nextNode) {
		load = obj;
		next = nextNode;
	}

	/**
	 * Returns node's load.
	 * 
	 * @return a generic object.
	 */
	public T getLoad() {
		return load;
	}

	/**
	 * Returns the node pointed by the current one.
	 * 
	 * @return a Node object.
	 */
	public Node<T> getNext() {
		return next;
	}
}
