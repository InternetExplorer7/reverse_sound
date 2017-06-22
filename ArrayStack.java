package soundblaster;

import java.util.EmptyStackException;

public class ArrayStack implements DStack{
	// "head" and "tail" are no longer pointers, but indexes!
	int size;
	int head;
	int tail;
	double[] array; // Will be used initially
	// Constructor
	public ArrayStack() {
		// initialize values.
		head = 0;
		tail = 0;
		size = 0;
		array = new double[10];
	}
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void push(double d) {
		size++;
		// Firstly, check to see if the tail is about to jump out of bounds.
		if (tail == array.length) {
			// Double the size!
			double[] copy = new double[array.length];
			copy = array;
			// Done copying.
			int newSize = array.length * 2;
			// reinitialize array with 2x size.
			array = new double[newSize];
			array = copyRangeFromArrayToArray(copy, array); // copy it back
		}
		// Otherwise, add next element.
		array[tail] = d;
		tail++;
	}
	
	// Copies the values from one array to the other.
	// uses the 'from' array for n.
	public double[] copyRangeFromArrayToArray(double[] from, double[] to) {
		for (int i = 0; i < from.length; i++) {
			to[i] = from[i];
		}
		return to;
	}
//	int a = 1;
	@Override
	public double pop() {
		/*
		 * TEST STUFF DELETE BEFORE RELEASE.
		 */
//		if (a == 1) {
//			System.out.println("size: " + this.size + "array.length: " + array.length + "at last element: " + array[154363]);
//			a++;
//			for(int j = 0; j < array.length; j++){
//				if (array[j] == 0.0) {
//					//System.out.println("Empty space.");
//				}
//			}
//		}
		double value = array[head];
		head++;
		if (head == tail) {
//			System.out.println("head: " + head + "; array.length: " + array.length + "; size: " + this.size);
			head = 0;
		}
		size--;
		return value;
	}

	@Override
	public double peek() {
		if (size == 0) {
			throw new EmptyStackException();
		}
		return array[head];
	}
	
}
