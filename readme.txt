Kaveh Khorram

1. How did you test that your stack implementations were correct?

A: By testing, obviously, the two given .wav files on the homework details page. After that, 
I continued testing by modifying the ".dat" file to different amounts of values, including edge-cases,
to success.

2. The file secret.wav is a backwards recording of a word or short phrase. Use sox (or another converter) and your program to reverse it, and write that as the answer to this question.

A: "The scent of bitter almonds always reminded him of the fate of unrequited love."

3. Your array stacks start with a small array and double in size if they become full. For a .dat file with 1 million lines, how many times would this resizing occur? What about with 1 billion lines or 1 trillion lines (assuming the computer had enough memory)? Explain your answer.

For a .dat file with 1 million lines, the array would resize 500,000.00 times.

1 billion entries would mean 500 million times.

1 trillion entries would mean 500 billion times.

4. Suppose that, instead of a DStack interface, you were given a fully-functional FIFO Queue class. How might you implement this project (i.e., simulate a Stack) with one or more instances of a FIFO Queue? 
   Assuming we're given: "enqueue, dequeue, isEmpty, and size"
   
   push(x) {
   	q1.enqueue(x); // We'll deal with fixing the order in pop().
   }
   
   pop() {
   	while (q1.size() > 1) {
   		// Iterate through entire queue.
   		top = q1.remove(); // remove from top of queue.
   		q2.enqueue(top);  // push to bottom of 2nd queue.
   	}
   	return q2.dequeue(); // remove from top of reversed queue, so top of stack.
   }
   
5. In the previous question, what trade-offs did you notice between a Queue implementation of a Stack and your original array-based implementation? Which implementation would you choose, and why?

A: Well, with a Queue (or Queues), I don't need to worry about the size of my data, I can add a very large number of things without worry about my limit when using Queues. I'd probably use Queues over Arrays since another problem with arrays is the large possibility of wasted space since we're expanding arrays by 2x each time, and there could be wasted space near the end if we don't fill up that 2x space on last cycle.

6. Include a description of how your project goes "above and beyond" the basic requirements (if it does).

A: Implemented a doubly-linked list? :P 

7.How many hours did this assignment take to complete?

A: 5 hours

8. What did you enjoy about this assignment? What did you not enjoy? What could you have done better?

A: More specific instruction on the implementation would be nice. Otherwise, it was fun!

9. What else, if anything, would you would like to include related to this homework?

A: Nothing, just looking forward to more exciting projects and tests (yay!)