package data_Structure;

public class Queue_UsingLinkedList {
	Node rear, front;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public Queue_UsingLinkedList() {
		rear = front = null;
	}

	public boolean isEmpty() {
		return front == null;
	}

	public void enQueue(int data) {
		Node new_node = new Node(data);

		if (isEmpty()) {
			rear = front = new_node;
			return;
		}
		rear.next = new_node;
		rear = new_node;
	}

	public int deQueue() {
		if (isEmpty()) {
			System.out.println("Queue Underflow");
			return -1;
		}
		int ans = front.data;
		front = front.next;
		return ans;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue Underflow");
			return -1;
		}
		return rear.data;
	}

	public int front() {
		if (isEmpty()) {
			System.out.println("Queue Underflow");
			return -1;
		}
		return front.data;
	}

	public int size() {
		if (isEmpty()) {
			System.out.println("Queue Underflow");
			return 0;
		}
		Node temp = front;
		int count = 1;
		while (temp.next != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public static void main(String[] args) {

		Queue_UsingLinkedList obj = new Queue_UsingLinkedList();

		System.out.println("Queue is Empty : " + obj.isEmpty());
		obj.enQueue(5);
		obj.enQueue(7);
		obj.enQueue(9);
		System.out.println("deQueue Element : " + obj.deQueue());
		System.out.println("Peek/Rear element : " + obj.peek());
		System.out.println("Front element : " + obj.front());
		System.out.println("Size of Queue : " + obj.size());
	}

}
