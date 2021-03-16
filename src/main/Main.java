package main;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		Tree tree = new Tree(new Node(random.nextInt(100) + 1));
		for (int i = 0; i < 100; i ++) {
			tree.addBranch(new Node(random.nextInt(100) + 1));
		}
		tree.printTree(tree.root);
		System.out.print("\n");
		tree.searchForNode(tree.root, 12);
	}

}
