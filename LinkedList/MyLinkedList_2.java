package data_Structure;

public class MyLinkedList_2 {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void display() {
		if (isEmpty())
			System.out.println("LinkedList Empty");

		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public void addNode(int data) {
		Node toAdd = new Node(data);

		if (isEmpty()) {
			head = toAdd;
			return;
		}
		Node n = head;
		while (n.next != null)
			n = n.next;
		n.next = toAdd;
		toAdd.next = null;
	}

	public void addFront(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}

	public void addAfter(Node prev_node, int data) {
		if (prev_node == null) {
			System.out.println("Previous node is null");
			return;
		}
		Node new_node = new Node(data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}

	public void deleteFront() {
		if (isEmpty()) {
			System.out.println("LinkedList Empty can't be deleted");
			return;
		}
		Node temp = head.next;
		head = temp;
	}

	public void deleteLast() {
		if (isEmpty()) {
			System.out.println("LinkedList empty can't be deleted");
			return;
		}
		Node temp = head;
		while (temp.next.next != null)
			temp = temp.next;

		temp.next = null;
	}

	public void deleteAfter(Node prev_node) {
		if (isEmpty()) {
			System.out.println("LinkedList empty");
			return;
		}
		Node temp = prev_node.next.next;
		prev_node.next = temp;
	}

	public void deleteKey(int key) {
		if (isEmpty()) {
			System.out.println("LinkedList empty");
			return;
		}
		if (head.data == key) {
			Node temp = head.next;
			head = temp;
			return;
		}
		Node temp = head;
		Node prev = null;
		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		// Key are not present in list
		if (temp == null)
			return;
		prev.next = temp.next;
	}

	public static void main(String[] args) {

		MyLinkedList_2 obj = new MyLinkedList_2();

		obj.addNode(1);
		obj.addNode(2);
		obj.addFront(3);
		obj.addFront(4);
		obj.addNode(7);
		obj.addNode(9);
		obj.addNode(11);
		obj.addAfter(head.next.next, 5);
		obj.deleteFront();
		obj.deleteLast();
		obj.deleteAfter(head.next.next);
		obj.deleteKey(9);

		obj.display();
	}

}
