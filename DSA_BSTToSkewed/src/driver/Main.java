package driver;

import bstskewed_logic.BSTToSkewedConversion;
import model.Node;

public class Main {

	public static void main(String[] args) {

		BSTToSkewedConversion tree = new BSTToSkewedConversion();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		/*
		 * Order of the Skewed tree is defined as follows
		 *   For Increasing order - 0 
		 *   For Decreasing order - 1
		 */
		int order = 0;
		tree.convertBSTToSkewed(tree.node, order);
		tree.traverseRightSkewed(tree.headNode);
	}

}