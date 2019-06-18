package com.sherold.dll;

public class Node {
	// <----- Attributes ----->
	public Integer value;
	public Node previous;
	public Node next;
	
	// <----- Constructors ----->
	public Node(Integer val) {
		this.value = val;
		this.previous = null;
		this.next = null;
	}
}
