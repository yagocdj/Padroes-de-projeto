package br.edu.ifpb.pps.main;

import br.edu.ifpb.pps.iterator.ListIterator;
import br.edu.ifpb.pps.linkedList.MyLinkedList;

public class MainApp {

	public static void main(String[] args) {
		
		// create a list
		MyLinkedList numbers = new MyLinkedList();
		
		numbers.pushToBack(1);
		numbers.pushToBack(3);
		numbers.pushToBack(5);
		numbers.pushToBack(7);
		
		ListIterator it = numbers.createNaturalOrderListIterator();
		
		System.out.println("My iterator (natural order):");
		while (it.hasNext()) {
			System.out.println(it.getNext());
		}
		
		ListIterator reverseIt = numbers.createReverseOrderListIterator();
		
		System.out.println("My other iterator (reverse order):");
		while (reverseIt.hasNext()) {
			System.out.println(reverseIt.getNext());
		}

	}

}
