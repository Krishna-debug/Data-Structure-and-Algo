package data_Structure;

public class MyLinkedList_Genric<E> {

	Node<E> head;

	public boolean isEmpty() {
		return head == null;
	}

	public void add(E data) {
		Node<E> toAdd = new Node<E>(data);
		if (isEmpty()) {
			head = toAdd;
			return;
		}
		Node<E> temp = head;
		while (temp.next != null)
			temp = temp.next;
		temp.next = toAdd;
	}

	public E delete() throws Exception {
		Node<E> temp = head;

		if (temp == null)
			throw new Exception("Linked List is Empty");

		if (temp.next == null) {
			Node<E> toRemove = head;
			head = null;
			return toRemove.data;
		}
		while (temp.next.next != null)
			temp = temp.next;

		Node<E> toRemove = temp.next;
		temp.next = null;

		return toRemove.data;
	}

	void display() {
		Node<E> temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	static class Node<E> {
		E data;
		Node<E> next;

		public Node(E d) {
			data = d;
		}
	}

	public static void main(String[] args) throws Exception {

		MyLinkedList_Genric<Integer> obj = new MyLinkedList_Genric<>();

		System.out.println("LinkedList is Empty : " + obj.isEmpty());
		obj.add(3);
		obj.add(5);
		obj.add(7);

		obj.display();
		System.out.println("Delete Element : " + obj.delete());
	}

}
