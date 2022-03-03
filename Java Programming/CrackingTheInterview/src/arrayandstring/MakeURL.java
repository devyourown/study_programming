package arrayandstring;

public class MakeURL {
	public static String changeToURL(String orig) {
		char[] copied = orig.toCharArray();
		String url = "";
		for(char c : copied) {
			if(c == ' ') {
				url += "%20";
			} else {
				url += c;
			}
		}
		return url;
	}

	public static void main(String[] args) {
		System.out.println(changeToURL("Mr John Smith"));
	}

}
