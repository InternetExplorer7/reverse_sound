package soundblaster;

import java.util.EmptyStackException;


public class ListStack implements DStack {
	private ListClassNode head;
	private int size; // the size of the Linked List. Used in methods.
	// Constructor, initialize methods.
	public ListStack() {
		head = null;
		size = 0;
	}
	@Override
	public boolean isEmpty() {
		return size == 0; // If the size is zero, then it is empty.
	}

	@Override
	public void push(double d) {
		if (head == null) {
			// first node
			head = new ListClassNode(d, null); // first element in stack; add first node and set head.
		} else {
			ListClassNode temp = head; // save head
			head = new ListClassNode(d, temp); // new head -> previous head
		}
		size++; // Reflect 'push' operation by incrementing size.
		
	}

	@Override
	public double pop() {
		// If size is 0, then throw exception.
		if (size == 0) {
			throw new EmptyStackException();
		}
		
		double value = head.value; // get the value @ head.
		head = head.next; // move down to next element.
		size--; // decrement the size.
		return value;
	}

	@Override
	public double peek() {
		if (size == 0) {
			throw new EmptyStackException();
		}
		
		// Otherwise, return the value at head without removing.
		return head.value;
	}
}