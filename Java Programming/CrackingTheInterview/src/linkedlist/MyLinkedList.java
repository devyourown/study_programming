package linkedlist;

public class MyLinkedList {
	
	Node head = new Node(-1);
	
	public void putFront(int data) {
		Node newNode = new Node(data);
		newNode.next = head.next;
		head.next = newNode;
	}
	
	public void putEnd(int data) {
		Node newNode = new Node(data);
		Node end = head;
		while(end.next != null) {
			end = end.next;
		}
		end.next = newNode;
	}
	
	public void remove(int data) {
		Node searchedNode = head.next;
		Node prev = head;
		
		while(searchedNode.data != data) {
			prev = searchedNode;
			searchedNode = searchedNode.next;
		}
		
		prev.next = searchedNode.next;
		searchedNode = null;
	}
	
	public boolean haveData(int data) {
		Node searchNode = head.next;
		while(searchNode != null) {
			if(searchNode.data == data) {
				return true;
			}
			searchNode = searchNode.next;
		}
		return false;
	}
	
	public void printAllNode() {
		Node searchNode = head.next;
		while(searchNode != null) {
			System.out.print(searchNode.data + " ");
			searchNode = searchNode.next;
		}
	}
	
	class Node {
		int data;
		Node next = null;
		Node(int data) {
			this.data = data;
		}
	}
}
