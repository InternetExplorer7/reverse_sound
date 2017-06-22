package soundblaster;

/**
 * Interface for a stack of primitive doubles.
 * @version CSE 373 17su
 * 
 * NOTE: The comments for this interface are horrible! You will
 *       need to write something better for your implementations.
 */
public interface DStack {
    /** 
     * Returns the truth value of a variable named 'size' being equal to zero.
     * Used often in While loops for iterating through an array.
     */
    public boolean isEmpty();

    /**
     * Adds a new item onto the List/Array from the tail.
     * Might have to add functionality to automatically resize if using Array implementation.
     */
    public void push(double d);

    /**
     * pop removes the element at 'head' and returns its value.
     * @return the deleted value
     * @throws EmptyStackException if stack is empty
     */
    public double pop();

    /**
     * peek returns the element at 'head,' but unlike pop, does not remove. Size remains the same.
     * @throws EmptyStackException if stack is empty
     */
    public double peek();
}
