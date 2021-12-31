package project.leetcode.code.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTest {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		//add method return the root of tree every time you add any new node
		tree.add(1);
		tree.add(2);
//		tree.add(3);
//		tree.add(15);
//		tree.add(25);
//		tree.add(9);
//		tree.add(4);
		TreeNode node= tree.add(3);
		
		
//		tree.inOrderTraversal(node);
		
		List<Integer> list = new ArrayList<>();
//		List<Integer> data =  tree.inorderTraversal(node, list);
		List<Integer> data =  tree.preorderTraversal(node, list);
	
			
		System.out.println(data);
		
	}

}
