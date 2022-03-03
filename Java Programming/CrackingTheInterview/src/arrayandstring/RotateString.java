package arrayandstring;

public class RotateString {
	public static boolean isSubString(String word, String subword) {
		return true;
	}
	
	public static boolean isRotated(String str1, String str2) {
		int distance = 0;
		char[] charArray1 = str1.toCharArray();
		char first = str2.charAt(0);
		for(char c : charArray1) {
			if(c == first) {
				break;
			} else {
				distance++;
			}
		}
		if(isSubString(str2, str1.substring(distance))) {
			if(str1.substring(0, distance).equals(str2.substring(str2.length()-distance, str2.length())))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String test1 = "waterbottle";
	}

}
