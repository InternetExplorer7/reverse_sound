package soundblaster;

import java.util.EmptyStackException;

public class ArrayStack implements DStack{
	// "head" is an index.
	int head;
	double[] array;
	public ArrayStack() {
		// initialize values.
		head = -1;
		array = new double[10]; // a nice default size.
	}
	@Override
	public boolean isEmpty() {
		return head == -1; // -1 since we don't want to miss popping our last element, array[head] when head = 0.
	}

	@Override
	public void push(double d) {
		if (head == -1) { // First push
			// first insert.
			head++; // Start head @ 0.
			array[head] = d;
			return;
		} else if(head == array.length - 1){
			// Reached the length, increase size.
			double[] copy = copyRangeFromArrayToArray(array, new double[array.length]); // copies elements from 'array' to 'copy.'
			array = new double[array.length * 2]; // 2x previous size.
			array = copyRangeFromArrayToArray(copy, array);
		}
		head++;
		array[head] = d;
	}
	
	// Copies the values from one array to the other.
	// uses the 'from' array for n.
	public double[] copyRangeFromArrayToArray(double[] from, double[] to) {
		for (int i = 0; i < from.length; i++) {
			to[i] = from[i];
		}
		return to;
	}
	@Override
	public double pop() {
		if (head == -1) {
			throw new EmptyStackException();
		}
		System.out.println("head: " + head);
		// Otherwise, there are still elements that exist in the set.
		double value = array[head]; // get value @ head.
		head--; // move head to next.
		return value;
	}

	@Override
	public double peek() {
		if (head == -1) {
			throw new EmptyStackException();
		}
		return array[head];
	}
	
}
