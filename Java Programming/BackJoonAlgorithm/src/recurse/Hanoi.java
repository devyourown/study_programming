package recurse;

import java.util.Scanner;

public class Hanoi {
	public static StringBuilder sb = new StringBuilder();
	
	public static void move(int start, int mid, int end, int num) {
		if(num == 1) {
			sb.append(start + " " + end + "\n");
			return;
		}
		
		move(start, end ,mid, num-1);
		sb.append(start + " " + end + "\n");
		move(mid, start, end, num-1);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		sb.append((int)Math.pow(2, N)-1).append("\n");
		move(1, 2, 3, N);
		System.out.print(sb.toString());
	}

}
