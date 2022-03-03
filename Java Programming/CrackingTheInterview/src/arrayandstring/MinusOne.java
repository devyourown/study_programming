package arrayandstring;

import java.util.Arrays;

public class MinusOne {
	public static boolean isEnoughOneTime(String str1, String str2) {
		int checkTime = 0;
		int maxCharLength = str1.length() < str2.length() ? str2.length() : str1.length();
		int difference = Math.abs(str1.length()-str2.length());
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		
		if(difference > 1) {
			return false;
		} else if(difference == 1) {
			char[] bigger = str1.length() < str2.length() ? charArray2 : charArray1;
			char[] smaller = str1.length() > str2.length() ? charArray2 : charArray1;
			for(int i=0, j=0; i<bigger.length; i++, j++) {
				if(j == smaller.length && checkTime == 0)
					return true;
				
				if(checkTime > 1)
					return false;
				
				if(bigger[i] != smaller[j]) {
					j-=1;
					checkTime++;
				}
			}
		} else {
			for(int i=0; i<maxCharLength; i++) {
				if(checkTime > 1) {
					return false;
				}
				if(charArray1[i] != charArray2[i]) {
					checkTime += 1;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		boolean result = isEnoughOneTime("pale", "pales");
		System.out.println(result);
	}

}
