package com.sherold.dll;

public class DLL {
	// <----- Attributes ----->
	public Node head;
	public Node tail;
	
	// <----- Constructors ----->
	public DLL() {
		this.head = null;
		this.tail = null;
	}
	
	// <----- Methods ----->
	// push method to add a new node to the end of the list
	public void push(Node newNode) {
		// if there is no head in the list, aka, an empty list, we set the newNode
		// to be the head and the tail of the list
		if(this.head == null) {
			this.head = newNode;
			this.tail = newNode;
			return;
		}
		
		// Otherwise, find the lastNode in the list then set the newNode to be the lastNode's 'next'.
		// Next, we have to set the previous of the newNode to the previous lastNode.
		// Finally, we set the newNode, now lastNode, to be the list's tail
		Node lastNode = this.tail;
		lastNode.next = newNode;
		newNode.previous = lastNode;
		this.tail = newNode;
	}
	
	// pop method removes the last node of the DLL and returns it
	public Node pop() {
		// Checks to see if there is a tail, if not return null
		if(this.tail == null) {
			return null;
		// Else remove the tail
		} else {
			// Tail Node to return
			Node tail = this.tail;
			// new lastNode equals the node before the tail
			Node lastNode = this.tail.previous;
			
			// lastNode will be set as the new tail, and have it's next node set to null
			lastNode.next = null;
			this.tail = lastNode;
			
			// returns popped node
			return tail;			
		}
	}
	
	// Prints the values of the node in order from first to last
	public void printValuesForward() {
		// find the first node, aka head.
		Node current = this.head;
		
		// while the current node exists...
		while(current != null) {
			// print its value
			System.out.println(current.value);
			
			// 'Iterate' to next Node
			current = current.next;
		}
	}
	
	// Prints the values of the node in order from last to first
	public void printValuesBackward() {
		// find the first node, aka head.
		Node current = this.tail;
		
		// while the current node exists...
		while(current != null) {
			// print its value
			System.out.println(current.value);
			
			// 'Iterate' to previous Node
			current = current.previous;
		}
	}

	// Searches the DLL for a specific value
	public boolean contains(int value) {
		// Find the first node, aka head.
		Node current = this.head;
		
		// While current exists
		while(current != null) {
			// If value is equal to this.value, return true
			if(current.value == value) {
				return true;
			}
			// 'Iterate' to next node
			current = current.next;
		}
		// if loop completes without returning true, return false
		return false;
	}
	
	// Returns the number of nodes
	public int size() {
		// Checks to see if there is a head
		int counter = 0;
		if(this.head == null) {
			return counter;
		// If there is a head, proceed to count
		} else {
			// Find the first node, aka head.
			Node current = this.head;
			
			// While current exists
			while(current != null) {
				// add to counter and 'iterate' to next node
				counter++;
				current = current.next;
			}
			return counter;
		}
	}
}
		
}
