package arrayandstring;

import java.util.Arrays;
import java.util.Hashtable;

public class Duplicated {

	//O(n)
	public static boolean isDuplicated(String words) {
		Hashtable<Character, Integer> table = new Hashtable<>();
		for (char word : words.toCharArray()) {
			if(table.containsKey(word)) {
				return true;
			} else {
				table.put(word, 1);
			}
		}
		return false;
	}
	//O(nlogn) not use Hash
	public static boolean isDuplicatedNotUseHash(String words) {
		char[] arrayOfWord = words.toCharArray();
		Arrays.sort(arrayOfWord);
		for(int i=1; i<arrayOfWord.length; i++) {
			if(arrayOfWord[i-1] == arrayOfWord[i]) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		String s = "abcedfuyf";
		System.out.println(isDuplicated(s));
		System.out.println(isDuplicatedNotUseHash(s));
	}

}
