package data_Structure;

import java.util.ArrayList;

public class Queue_UsingDynamicArray {

	ArrayList<Integer> arr = new ArrayList<>();
	int rear, front;

	public Queue_UsingDynamicArray() {
		rear = front = -1;
	}

	public boolean isEmpty() {
		return front == -1;
	}

	public boolean isFull() {
		return rear == arr.size();
	}

	public void enQueue(int data) {
		if (isEmpty()) {
			rear = front = 0;
			arr.add(rear, data);
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
		return rear - front + 1;
	}

	public static void main(String[] args) {

		Queue_UsingDynamicArray obj = new Queue_UsingDynamicArray();

		System.out.println("Queue is Empty : " + obj.isEmpty());
		System.out.println("Queue is full : " + obj.isFull());
		obj.enQueue(5);
		obj.enQueue(7);
		obj.enQueue(9);
		System.out.println("deQueue Element : " + obj.deQueue());
		System.out.println("Peek/Rear element : " + obj.peek());
		System.out.println("Front element : " + obj.front());
		System.out.println("Size of Queue : " + obj.size());
	}

}
