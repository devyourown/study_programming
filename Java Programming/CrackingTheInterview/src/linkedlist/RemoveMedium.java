package linkedlist;

import linkedlist.MyLinkedList.Node;

public class RemoveMedium {

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		Node searchNode = list.head.next;
		Node removalNode = null;
		while(searchNode != null) {
			if(searchNode == list.head.next) {
				searchNode = searchNode.next;
			} else if(searchNode.next != null) {
				removalNode = searchNode;
				break;
			}
		}
		list.remove(removalNode.data);
	}

}
