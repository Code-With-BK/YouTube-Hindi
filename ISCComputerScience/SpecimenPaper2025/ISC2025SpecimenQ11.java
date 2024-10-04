/**
 * 
 * @author Balkrishna Srivastava
 * Copyright © CodeWithBK 2024. All rights reserved.
 * 
 * Java code solution for Question 11
 * ISC 2025 Computer Science Boards Specimen Paper
 */

class Node {
	int n;
	Node link;
}

public class ISC2025SpecimenQ11 {
	
	static Node createLinkedList(int ... arr) {
		Node head = null;
		Node tail = null;
		for( int i : arr ) {
			if( head == null ) {
				head = new Node();
				head.n = i;
				tail = head;
			}
			else {
				Node newNode = new Node();
				newNode.n = i;
				tail.link = newNode;
				tail = newNode;
			}
		}
		return head;
	}
	
	static void printLinkedList(Node str) {
		Node curr = str;
		while( curr!=null ) {
			System.out.print(curr.n + " -> ");
			curr = curr.link;
		}
		System.out.print("null");
	}
	
	// the method to complete
	static void FindNode(Node str, int b) {
		// to store if the value was found or not
		boolean found = false;
		// start searching from the first node of the list
		Node t = str;
		// as long as there is a node in the list
		while( t!=null ) {
			// check if this node contains the value b
			if( t.n==b ) {
				found = true;
				break;
			}
			t = t.link;
		}
		
		if( found ) {
			System.out.println("Number " + b + " found in the linked list");
		}
		else {
			System.out.println("Number " + b + " not found in the linked list");
		}
	}
	
	public static void main(String args[]) {
		// create list
		Node str = createLinkedList(1,5,10,18,3,7);
		
		// show list
		System.out.print("List: ");
		printLinkedList(str);
		System.out.println();
		
//		int b = 4;
//		FindNode(str, b);
		
		for( int i=1; i<=20; i++ ) {
			FindNode(str, i);
		}
	}
}
