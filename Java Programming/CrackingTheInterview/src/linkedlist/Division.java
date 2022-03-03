package linkedlist;

import linkedlist.MyLinkedList.Node;

public class Division {

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		int divisionValue = 5;
		Node currentNode = list.head.next;
		while(currentNode != null) {
			if(divisionValue > currentNode.data) {
				list.remove(currentNode.data);
				list.putFront(currentNode.data);
			} 
		}
	}

}
