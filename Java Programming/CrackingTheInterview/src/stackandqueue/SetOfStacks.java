package stackandqueue;

import java.util.Stack;

public class SetOfStacks {
	private Stack<Integer>[] stacks;
	private int currentIndex;
	public final static int MAX_STACK = 10;
	
	public SetOfStacks() {
		currentIndex = 0;
		stacks[currentIndex] = new Stack();
	}
	
	public int pop() {
		if(stacks[currentIndex].capacity() < 1) {
			if(currentIndex == 0) {
				System.out.println("out of stack");
				return -1;
			} else {
				currentIndex -= 1;
				return stacks[currentIndex].pop();
			}
		} 
		return stacks[currentIndex].pop();
	}
	
	public void push(int data) {
		if(stacks[currentIndex].capacity() == MAX_STACK) {
			currentIndex++;
			stacks[currentIndex] = new Stack();
		}
		stacks[currentIndex].push(data);
	}
	
	public int peek() {
		return stacks[currentIndex].peek();
	}
	
	public int popAt(int index) {
		if(currentIndex >= index) {
			return stacks[index].pop();
		} else {
			System.out.println("out of index");
			return -1;
		}
	}
}
