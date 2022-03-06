package project.leetcode.code.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class BinaryTreeTest {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		//add method return the root of tree every time you add any new node
		tree.add(3);
		tree.add(9);
		tree.add(20);
		tree.add(15);
		tree.add(30);
		TreeNode node= tree.add(7);
		
//		BinaryTree tree1 = new BinaryTree();
//		//add method return the root of tree every time you add any new node
//		tree1.add(3);
//		tree1.add(9);
//		tree1.add(20);
//		tree1.add(15);
//		tree1.add(30);
//		
//		TreeNode node1= tree1.add(7);
////		
		
		
//		tree.inOrderTraversal(node);
		
		List<Integer> list = new ArrayList<>();
		
//		 tree.bottomViewOfBinaryTree(node);
//		tree.levlOrderTraversalBinaryTree(node);
//		tree.levelOrderTraversal(node);
//		tree.largestValueInEachRow(node);
//		tree.evenOddTree(node);
		System.out.println(tree.sumOfAllNodes(node));
//		tree.topViewOfBinaryTree(node);
//		tree.leftViewOfATree(node);
//		tree.rightViewOfATree(node);
//		//InOrder sorted traversa.
//		List<Integer> data =  tree.inorderTraversal(node, list);
//		System.out.println(data);
		
//		List<Integer> data =  tree.preorderTraversal(node, list);
//		System.out.println(data);
//		tree.depthFirstSearchTraverslaWithStack(node);
//		tree.bredthFirstSearch(node);
////		
//	
//		System.out.println(tree.numberOfLeafNodesTotal(node));
		
//		System.out.println(tree.sumOfLeftlevesResult(node));
//		
//		System.out.println(tree.numberOfLeafNodesTotalWithStack(node));
//		
//		System.out.println(tree.findHeightOfTree(node));
		
//		System.out.println(tree.countFullNodesInTree(node));
		
//		System.out.println(tree.countAllNodesOfTree(node));
		//2.Preorder
//		System.out.println(tree.findminDepthOfTree(node));
//		System.out.println(tree.findHeightOrDepthOfTree(node));
//		List<Integer> data =  tree.preorderTraversal(node, list);
		
//		System.out.println(tree.symetricTree(node,node1));

	
		
		//3.Sum of left leves
//		System.out.println(tree.sumOfLeftlevesResult(node));
		
		
		//3.Sum of left leves
//		System.out.println(tree.numberOfLeafNodesTotal(node));
		
		//4. Find node
//		TreeNode newRoot = tree.searchinBinarySearchTree(node,20);
//		System.out.println(newRoot.data);
//		list = new ArrayList<>();
//		data =  tree.inorderTraversal(newRoot, list);
//		System.out.println(data);
		
		
	}

}
