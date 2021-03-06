package stackandqueue;

import java.util.Stack;

public class SortedStack {
	public Stack<Integer> stack = new Stack();
	
	public void sort() {
		Stack<Integer> stackHelper = new Stack();
		while(!stack.isEmpty()) {
			int temp = stack.pop();
			while(!stackHelper.isEmpty() && stackHelper.peek() > temp) {
				stack.push(stackHelper.pop());
			}
			stackHelper.push(temp);
		}
		
		while(!stackHelper.isEmpty()) {
			stack.push(stackHelper.pop());
		}
	}
}
