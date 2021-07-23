package data_Structure;

public class MyLinkedList_1 {

	Node head;

	static class Node {
		int data;
		Node next;

		// Constructor
		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void display() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	public static void main(String[] args) {

		MyLinkedList_1 obj = new MyLinkedList_1();

		obj.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		obj.head.next = second;
		second.next = third;
		obj.display();
	}

}
