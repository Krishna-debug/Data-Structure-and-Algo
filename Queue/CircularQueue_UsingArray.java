package data_Structure;

public class CircularQueue_UsingArray {

	static final int MAX_SIZE = 100;

	int rear, front;
	int[] arr = new int[MAX_SIZE];

	public CircularQueue_UsingArray() {
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
			arr[rear] = data;
			return;
		}
		if (rear == MAX_SIZE - 1) {
			rear = 0;
			arr[rear] = data;
			return;
		}
		rear++;
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
		if (front == MAX_SIZE - 1) {
			int ans = arr[MAX_SIZE - 1];
			front = 0;
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
				System.out.print(arr[i] + " ");
			}
		} else {
			for (int i = front; i < MAX_SIZE; i++) {
				System.out.print(arr[i] + " ");
			}
			for (int i = 0; i <= rear; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	}

	public static void main(String[] args) {

		CircularQueue_UsingArray obj = new CircularQueue_UsingArray();

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
