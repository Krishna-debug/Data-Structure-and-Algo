package data_Structure;

import java.util.ArrayList;

public class Stack_UsingDynamicArray {

	static ArrayList<Integer> arr = new ArrayList<>();
	int top = -1;

	public boolean isEmpty() {
		return top < 0;
	}

	public boolean isFull() {
		return top == arr.size();
	}

	public void push(int data) {
		if (isFull()) {
			System.out.println("Stack Overflow");
			return;
		}
		top++;
		arr.add(top, data);
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		}
		int ans = arr.get(top);
		top--;
		return ans;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		}
		return arr.get(top);
	}

	public int size() {
		return top + 1;
	}

	public boolean search(int element) {
		return arr.contains(element);
	}

	public static void main(String[] args) {

		Stack_UsingDynamicArray obj = new Stack_UsingDynamicArray();

		System.out.println("Stack is Empty : " + obj.isEmpty());
		System.out.println("Stack is full : " + obj.isFull());
		obj.push(2);
		obj.push(3);
		obj.push(5);

		System.out.println("Pop element : " + obj.pop());
		System.out.println("Top/Peek element : " + obj.peek());
		System.out.println("Size of Stack : " + obj.size());
		System.out.println("Item is present : " + obj.search(11));

	}

}
