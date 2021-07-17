package data_Structure;

public class Queue_UsingArray {

	static final int MAX_SIZE = 100;

	int rear, front;
	int[] arr = new int[MAX_SIZE];

	public Queue_UsingArray() {
		rear = front = -1;
	}

	public boolean isEmpty() {
		return front == -1;
	}

	public boolean isFull() {
		return rear == MAX_SIZE - 1;
	}

	public void enQueue(int data) {
		if (isFull()) {
			System.out.println("Queue Overflow");
			return;
		}
		if (isEmpty()) {
			rear = front = 0;
			arr[rear] = data;
			return;
		}
		rear++;
		// arr[++rear] = data;
		arr[rear] = data;
	}

	public int deQueue() {
		if (isEmpty()) {
			System.out.println("Queue Underflow");
			return -1;
		}
		if (rear == front) {
			int ans = arr[front];
			rear = front = -1;
			return ans;
		}
		return arr[front++];
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue Underflow");
			return -1;
		}
		return arr[rear];
	}

	public int front() {
		if (isEmpty()) {
			System.out.println("Queue Underflow");
			return -1;
		}
		return arr[front];
	}

	public int size() {
		if (isEmpty()) {
			System.out.println("Queue Underflow");
			return 0;
		}
		return rear - front + 1;
	}

	public static void main(String[] args) {

		Queue_UsingArray obj = new Queue_UsingArray();

		System.out.println("Queue is Empty : " + obj.isEmpty());
		System.out.println("Queue is full : " + obj.isFull());
		obj.enQueue(2);
		obj.enQueue(3);
		obj.enQueue(5);
		obj.enQueue(7);

		System.out.println("DeQueue element : " + obj.deQueue());
		System.out.println("Front element : " + obj.front());
		System.out.println("Peek/Rear element : " + obj.peek());
		System.out.println("Size of Queue : " + obj.size());
	}

}
