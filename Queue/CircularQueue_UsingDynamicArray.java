package data_Structure;

import java.util.ArrayList;

public class CircularQueue_UsingDynamicArray {

	static final int MAX_SIZE = 100;

	int rear, front;
	ArrayList<Integer> arr = new ArrayList<>(MAX_SIZE);

	public CircularQueue_UsingDynamicArray() {
		rear = front = -1;
	}

	public boolean isEmpty() {
		return front == -1;
	}

	public boolean isFull() {
		if ((front == 0 && rear == MAX_SIZE - 1) || (front == (rear + 1) % MAX_SIZE))
			return true;
		return false;
	}

	public void enQueue(int data) {
		if (isFull()) {
			System.out.println("Queue Overflow");
			return;
		}
		if (isEmpty()) {
			rear = front = 0;
			arr.add(rear, data);
			return;
		}
		// Update Existing/Old value that are store in same position
		if (rear == MAX_SIZE - 1) {
			rear = 0;
			arr.set(rear, data);
			return;
		}
		rear++;
		arr.add(rear, data);
	}

	public int deQueue() {
		if (isEmpty()) {
			System.out.println("Queue Underflow");
			return -1;
		}
		if (rear == front) {
			int ans = arr.get(front);
			rear = front = -1;
			return ans;
		}
		if (front == MAX_SIZE - 1) {
			int ans = arr.get(MAX_SIZE - 1);
			front = 0;
			return ans;
		}
		int ans = arr.get(front);
		front++;
		return ans;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue Underflow");
			return -1;
		}
		return arr.get(rear);
	}

	public int front() {
		if (isEmpty()) {
			System.out.println("Queue Underflow");
			return -1;
		}
		return arr.get(front);
	}

	public int size() {
		if (isEmpty()) {
			System.out.println("Queue Underflow");
			return 0;
		}
		if (front > rear) {
			return MAX_SIZE - front + rear + 1;
		}
		return rear - front + 1;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Queue Underflow");
			return;
		}
		if (rear >= front) {
			for (int i = front; i <= rear; i++) {
				System.out.print(arr.get(i) + " ");
			}
		} else {
			for (int i = front; i <= MAX_SIZE - 1; i++) {
				System.out.print(arr.get(i) + " ");
			}
			for (int i = 0; i <= rear; i++) {
				System.out.print(arr.get(i) + " ");
			}
		}
	}

	public static void main(String[] args) {

		CircularQueue_UsingDynamicArray obj = new CircularQueue_UsingDynamicArray();

		System.out.println("Queue is Empty : " + obj.isEmpty());
		System.out.println("Queue is full : " + obj.isFull());
		obj.enQueue(2);
		obj.enQueue(3);
		obj.enQueue(5);
		obj.enQueue(7);
		System.out.println("DeQueue element : " + obj.deQueue());
		System.out.println("Peek/Rear element : " + obj.peek());
		System.out.println("Front element : " + obj.front());
		System.out.println("Size of Queue : " + obj.size());
		obj.display();
	}

}
