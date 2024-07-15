package br.edu.ifpb.pps.linkedList;

public class EmptyListException extends Exception {
	private static final long serialVersionUID = 1L;

	public EmptyListException(String errorMessage) {
		super(errorMessage);
	}
}
