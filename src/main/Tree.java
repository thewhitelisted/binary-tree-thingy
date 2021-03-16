package main;

public class Tree {
	Node root;
	int parents = 0;

	public Tree(Node root) {
		this.root = root;
	}
	public void searchForNode(Node root, int val) {
		if (val == root.val) {
			System.out.println("Found value " + root.val + " with " + parents + " parents");
			parents = 0;
		} else if (val < root.val && root.left != null) {
			parents ++;
			searchForNode(root.left, val);
		} else if (val > root.val && root.right != null) {
			parents ++;
			searchForNode(root.right, val);
		} else {
			System.out.println("Could not find node with matching value");
			parents = 0;
		}
	}
	public void addBranch(Node newNode) {
		root.addNode(newNode);
	}
	public void printTree(Node root) {
		// print left values
		// print value
		// print right values
		if (root.left == null && root.right == null) {
			System.out.print(root.val + " ");
		} else if (root.left == null) {
			System.out.print(root.val + " ");
			printTree(root.right);
		} else if (root.right == null) {
			printTree(root.left);
			System.out.print(root.val + " ");
		} else {
			printTree(root.left);
			System.out.print(root.val + " ");
			printTree(root.right);
		}
		
	}
}
