package soundblaster;

import java.util.EmptyStackException;


public class ListStack implements DStack {
	private ListClassNode head;
	private ListClassNode tail;
	private int size; // the size of the Linked List. Used in methods.
	// Constructor, initialize methods.
	public ListStack() {
		head = null;
		tail = null;
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
			head = new ListClassNode(d, null); // Add first value, null next.
		} else if (tail == null) {
			head.next = new ListClassNode(d, null); // Second value, next head.
			tail = head.next; // Finally, set our tail.
		} else {
			tail.next = new ListClassNode(d, null); // point previous last to new last.
			tail = tail.next; // update tail.
		}
		size++; // Reflect 'push' operation by incrementing size.
		
	}

	@Override
	public double pop() {
		// If size is 0, then throw exception.
		if (size == 0) {
			throw new EmptyStackException();
		}
		
		// If our tail pointer is null, then we only have one node and 'pop' will make the stack empty.
		// Therefore, head can't point to next, because next is null.
		if (tail == null) {
			ListClassNode saveHead = head;
			head = null; // pop it off.
			size--; // reflect size decrease; expected: 0.
			return saveHead.value; // Return the value of previous head.
		}
		
		// Otherwise, we do have a tail pointer and > 1 node(s) in our Linked List.
		ListClassNode saveHead = head; // Save this before we dereference it.
		head = head.next;
		size--;
		return saveHead.value;
	}

	@Override
	public double peek() {
		if (size == 0) {
			throw new EmptyStackException();
		}
		
		// Otherwise, return the value at head without removing.
		return head.value;
		
		// "size" doesn't change since we're only peeking! :)
	}
}