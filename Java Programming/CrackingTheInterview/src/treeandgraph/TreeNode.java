package treeandgraph;

import java.util.LinkedList;

public class TreeNode {
	TreeNode left;
	TreeNode right;
	int data;
	LinkedList<Integer> depthList[] = new LinkedList[100];
	
	TreeNode(int data) {
		this.data = data;
	}
	
	public TreeNode createMinBST(int arr[]) {
		return createMinBST(arr, 0, arr.length-1);
	}
	
	public TreeNode createMinBST(int arr[], int start, int end) {
		if(start > end) {
			return null;
		}
		
		int mid = (start+end) / 2;
		TreeNode node = new TreeNode(arr[mid]);
		node.left = createMinBST(arr, start, mid-1);
		node.right = createMinBST(arr, mid+1, end);
		return node;
	}
	
	public void inOrderTraversal(TreeNode root, int depth) {
		if(root == null) {
			return;
		}
		
		depthList[depth].add(root.data);
		inOrderTraversal(root.left, depth+1);
		inOrderTraversal(root.right, depth+1);
		
	}
	
	public boolean isTreeBalanced() {
		int left = howDeepDepth(this.left, 0);
		int right = howDeepDepth(this.right, 0);
		boolean isBalanced = Math.abs(left-right) > 1 ? false : true;
		return isBalanced;
	}
	
	public int howDeepDepth(TreeNode root, int depth) {
		if(root == null) {
			return depth;
		}
		
		int left = howDeepDepth(root.left, depth+1);
		int right = howDeepDepth(root.right, depth+1);
		int higher = Math.max(left, right);
		return higher;
	}
}
