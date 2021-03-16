package main;

public class Node {
	Node left = null;
	Node right = null;
	int val;
	
	public Node(int val) {
		this.val = val;
	}
	
	public void addNode(Node newNode) {
		if (newNode.val < this.val && this.left == null) {
			this.left = new Node(newNode.val);
		}
		else if (newNode.val > this.val && this.right == null) {
			this.right = new Node(newNode.val);
		}
		if (newNode.val < this.val) {
			this.left.addNode(newNode);
		} else if (newNode.val > this.val) {
			this.right.addNode(newNode);
		}
	}
}
