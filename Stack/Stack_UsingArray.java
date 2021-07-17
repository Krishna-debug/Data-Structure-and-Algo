package data_Structure;

public class Stack_UsingArray {

	static final int MAX_SIZE = 100;
	int top;
	int[] arr = new int[MAX_SIZE];

	public Stack_UsingArray() {
		top = -1;
	}

	public boolean isEmpty() {
		return top < 0;
	}

	public boolean isFull() {
		return top >= MAX_SIZE - 1;
	}

	public void push(int data) {
		if (isFull()) {
			System.out.println("Stack Overflow");
			return;
		}
		arr[++top] = data;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		}
		return arr[top--];
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		}
		return arr[top];
	}

	public int size() {
		return top + 1;
	}

	public boolean search(int element) {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return false;
		}
		for (int i = 0; i <= top; i++) {
			if (arr[i] == element)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {

		Stack_UsingArray obj = new Stack_UsingArray();

		System.out.println("Stack is Empty : " + obj.isEmpty());
		obj.push(2);
		obj.push(3);
		obj.push(5);
		obj.push(7);
		obj.push(9);

		System.out.println("Pop element : " + obj.pop());
		System.out.println("Top/Peek element : " + obj.peek());
		System.out.println("Size of stack : " + obj.size());
		System.out.println("Stack is full : " + obj.isFull());
		System.out.println("Item is present : " + obj.search(7));
	}

}
