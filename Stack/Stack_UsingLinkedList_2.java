package data_Structure;

// Time Complexity O(1) in all operation

public class Stack_UsingLinkedList_2 {

	Node head;

	class Node {
		Node next;
		int data;

		public Node(int data) {
			this.data = data;
		}
	}
	// Add Element at start/front position then make all opertions in O(1)
	// Find all element at front of linked-list not traverse entire whole list

	public boolean isEmpty() {
		return head == null;
	}

	public void push(int data) {
		Node new_node = new Node(data);

		if (isEmpty()) {
			head = new_node;
			return;
		}
		new_node.next = head;
		head = new_node;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		}
		Node temp = head;
		head = head.next;

		return temp.data;
	}

	public int top() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		}
		return head.data;
	}

	public boolean search(int item) {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return false;
		}
		Node temp = head;
		while (temp != null) {
			if (temp.data == item) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public int size() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return 0;
		}
		int count = 0;
		Node temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public static void main(String[] args) {

		Stack_UsingLinkedList_2 obj = new Stack_UsingLinkedList_2();

		System.out.println("Stack is Empty : " + obj.isEmpty());
		obj.push(5);
		obj.push(6);
		obj.push(7);
		System.out.println("Pop element : " + obj.pop());
		System.out.println("Top element : " + obj.top());
		System.out.println("Size of stack : " + obj.size());
		System.out.println("Element is present : " + obj.search(9));
	}

}
