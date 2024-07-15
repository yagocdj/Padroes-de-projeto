package br.edu.ifpb.pps.main;

import br.edu.ifpb.pps.iterator.ListIterator;
import br.edu.ifpb.pps.linkedList.MyLinkedList;

public class MainApp {

	public static void main(String[] args) {

		// create a list of integers and fill it
		MyLinkedList<Integer> numbers = new MyLinkedList<Integer>();

		numbers.pushToBack(1);
		numbers.pushToBack(3);
		numbers.pushToBack(5);
		numbers.pushToBack(7);

		// iterate over "numbers" using natural order iterator (from start to end of the linked list)
		ListIterator<Integer> it = numbers.createNaturalOrderListIterator();

		System.out.println("My iterator (natural order):");
		while (it.hasNext()) {
			System.out.print(it.getNext() + " ");
		}
		System.out.println("");

		// iterate over "numbers" using reverse order iterator (from end to start of the linked list)
		ListIterator<Integer> reverseIt = numbers.createReverseOrderListIterator();

		System.out.println("My other iterator (reverse order):");
		while (reverseIt.hasNext()) {
			System.out.print(reverseIt.getNext() + " ");
		}
		System.out.println();

		// reset both iterators
		it.reset();
		reverseIt.reset();

	}

}
