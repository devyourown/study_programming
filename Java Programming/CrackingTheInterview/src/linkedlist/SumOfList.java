package linkedlist;

import linkedlist.MyLinkedList.Node;

public class SumOfList {
	public static int makeValue(Node head) {
		int value = 0;
		int digit = 0;
		while(head != null) {
			value += head.data * (int) Math.pow(10, digit);
			head = head.next;
			digit++;
		}
		return value;
	}
	
	public static MyLinkedList makeNode(int value) {
		MyLinkedList list = new MyLinkedList();
		while(value != 0) {
			list.putEnd(value%10);
			value /= 10;
		}
		return list;
	}

	public static void main(String[] args) {
		MyLinkedList firstList = new MyLinkedList();
		firstList.putFront(6);
		firstList.putFront(1);
		firstList.putFront(7);
		
		MyLinkedList secondList = new MyLinkedList();
		secondList.putFront(2);
		secondList.putFront(9);
		secondList.putFront(5);
		
		int firstValue = makeValue(firstList.head.next);
		int secondValue = makeValue(secondList.head.next);
		
		MyLinkedList result = makeNode(firstValue+secondValue);
		result.printAllNode();
		
	}

}
