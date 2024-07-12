package br.edu.ifpb.pps.linkedList;

public class Node {

	public Object load;
	public Node next;

	/**
	 * Creates a node that references an object.
	 * 
	 * @param obj - a generic object.
	 */
	public Node(Object obj) {
		this(obj, null);
	}

	/**
	 * Creates a node that references an object and the list's next node.
	 * 
	 * @param obj      - a generic object.
	 * @param nextNode - pointer to the list's next node.
	 */
	public Node(Object obj, Node nextNode) {
		load = obj;
		next = nextNode;
	}

	/**
	 * Returns node's load.
	 * 
	 * @return a generic object.
	 */
	public Object getObject() {
		return load;
	}

	/**
	 * Returns the node pointed by the current one.
	 * 
	 * @return a Node object.
	 */
	public Node getNext() {
		return next;
	}
}
