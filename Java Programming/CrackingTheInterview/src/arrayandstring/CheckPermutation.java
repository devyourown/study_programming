package arrayandstring;

import java.util.Hashtable;

public class CheckPermutation {
	//두가지 방법이 있다.
	//첫째는 모두 정렬한 뒤 같은 지 비교하는 방법 O(aloga + blogb) = O(2 aloga) because a=b
	//두번째는 Hashtable을 이용한 비교 방법 O(a), because a = b 
	public static boolean isPermutation(String words1, String words2) {
		if(words1.length() != words2.length())
			return false;
		Hashtable<Character, Integer> hash = new Hashtable<Character, Integer>();
		for(char c : words1.toCharArray()) {
			if(hash.containsKey(c)) {
				hash.put(c, hash.get(c)+1);
			} else {
				hash.put(c, 1);
			}
		}
		for(char c : words2.toCharArray()) {
			if(!hash.containsKey(c)) {
				return false;
			} else {
				hash.replace(c, hash.get(c)-1);
			}
		}
		
		for(int tableValue : hash.values()) {
			if(tableValue != 0) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		String a = "abcdef";
		String b = "bfdeae";
		System.out.println(isPermutation(a,b));
	}

}
