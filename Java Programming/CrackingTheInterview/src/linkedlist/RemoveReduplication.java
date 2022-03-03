package linkedlist;

import java.util.HashMap;
import java.util.LinkedList;

public class RemoveReduplication {
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();
		for(int data : list) {
			if(map.containsKey(data)) {
				list.remove(data);
			} else {
				map.put(data, true);
			}
		}
	}
	
}
