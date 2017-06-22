package soundblaster;

public class ListClassNode {
	// Each node will have two values:
	// The value ("value") of type "Double."
	// A reference to the next node ("node") of type "ListClassNode."
	double value;
	ListClassNode next;
	ListClassNode prev;
	ListClassNode(ListClassNode prev, double value, ListClassNode next) {
		this.value = value;
		this.next = next;
		this.prev = prev;
	}
}
