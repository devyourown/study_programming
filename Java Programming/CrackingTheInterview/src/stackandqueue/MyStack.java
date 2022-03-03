package stackandqueue;

public class MyStack {
	private static class MyStackNode {
		private int data;
		private MyStackNode next;
		public MyStackNode(int data) {
			this.data = data;
		}
	}
	
	private MyStackNode top;
	public int min = Integer.MAX_VALUE;
	
	public void push(int data) {
		MyStackNode newNode = new MyStackNode(data);
		if(min > data)
			min = data;
		top.next = top;
		top = newNode;
	}
	
	public int pop() throws Exception {
		if(top == null) throw new Exception();
		int result = top.data;
		top = top.next;
		return result;
	}
	
	public int peek() throws Exception {
		if(top == null) throw new Exception();
		return top.data;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
}
