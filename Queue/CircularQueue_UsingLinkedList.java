package data_Structure;

public class CircularQueue_UsingLinkedList {

	Node rear, front;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public CircularQueue_UsingLinkedList() {
		front = rear = null;
	}

	public boolean isEmpty() {
		return front == null;
	}

	public void enQueue(int data) {
		Node new_node = new Node(data);
		if (isEmpty())
			front = new_node;
		else
			rear.next = new_node;

		rear = new_node;
		rear.next = front;
	}

	public int deQueue() {
		if (isEmpty()) {
			System.out.printf("Queue Underflow");
			return -1;
		}
		if (front == rear) {
			int ans = front.data;
			rear = front = null;
			return ans;
		}
		int ans = front.data;
		front = front.next;
		rear.next = front;

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
		int size = 0;
		while (temp.next != front) {
			size++;
			temp = temp.next;
		}
		return size + 1;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Queue Underflow");
			return;
		}
		Node temp = front;

		while (temp.next != front) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.print(temp.data);
	}

	public static void main(String args[]) {

		CircularQueue_UsingLinkedList obj = new CircularQueue_UsingLinkedList();

		System.out.println("Queue is Empty : " + obj.isEmpty());
		obj.enQueue(1);
		obj.enQueue(3);
		obj.enQueue(5);
		obj.enQueue(6);
		System.out.println("DeQueue element : " + obj.deQueue());
		System.out.println("Peek/Rear element : " + obj.peek());
		System.out.println("Front element : " + obj.front());
		System.out.println("Size of Queue : " + obj.size());
		obj.display();

	}
}
