package data_Structure;

// Ttime Comlexity of All Operation O(n)
// All element in linked-list search, add, delete, from last

public class Stack_UsingLinkedList_1 {

	Node head;

	class Node {
		Node next;
		int data;

		public Node(int data) {
			this.data = data;
		}
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void push(int data) {
		Node new_node = new Node(data);

		if (isEmpty()) {
			head = new_node;
			return;
		}
		Node temp = head;
		while (temp.next != null)
			temp = temp.next;

		temp.next = new_node;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		}
		if (head.next == null) {
			int ans = head.data;
			head = null;
			return ans;
		}
		Node temp = head;
		while (temp.next.next != null)
			temp = temp.next;

		int ans = temp.next.data;
		temp.next = null;

		return ans;
	}

	public int top() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		}
		Node temp = head;
		while (temp.next != null)
			temp = temp.next;

		int ans = temp.data;
		return ans;
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

		Stack_UsingLinkedList_1 obj = new Stack_UsingLinkedList_1();

		System.out.println("Stack is Empty : " + obj.isEmpty());
		obj.push(5);
		obj.push(3);
		obj.push(8);
		System.out.println("Pop element : " + obj.pop());
		System.out.println("Top element : " + obj.top());
		System.out.println("Size of stack : " + obj.size());
		System.out.println("Element is present : " + obj.search(11));
	}

}
