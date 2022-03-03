package arrayandstring;

public class CompressString {
	public static String compress(String origin) {
		char base = ' ';
		int repeated = 1;
		String result = "";
		for(char c : origin.toCharArray()) {
			if(base == ' ') {
				base = c;
				continue;
			}
			
			if(base == c) {
				repeated++;
			} else {
				result += String.valueOf(base) + repeated;
				base = c;
				repeated = 1;
			}
		}
		result += String.valueOf(base) + repeated;
		
		if(result.length() > origin.length()) {
			return origin;
		}
		
		return result;
	}
	
	public static String compressBetter(String origin) {
		StringBuilder sentence = new StringBuilder();
		int countConsecutive = 0;
		for(int i=0; i<origin.length(); i++) {
			countConsecutive++;
			
			if(i+1 >= origin.length() || origin.charAt(i) != origin.charAt(i+1)) {
				sentence.append(origin.charAt(i));
				sentence.append(countConsecutive);
			}
		}
		
		return sentence.length() > origin.length() ? origin : sentence.toString();
	}

	public static void main(String[] args) {
		String test1 = "aabbccccaaa";
		System.out.println(compress(test1));
	}

}
