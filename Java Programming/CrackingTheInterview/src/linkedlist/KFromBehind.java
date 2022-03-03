package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class KFromBehind {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		int k = 10;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		int size = 0;
		
		
		for(int data : list) {
			size++;
			arrayList.add(data);
		}
		arrayList.get(size-k);
	}

}
