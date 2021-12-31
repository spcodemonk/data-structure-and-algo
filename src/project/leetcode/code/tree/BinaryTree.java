package project.leetcode.code.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

	TreeNode root;

	public TreeNode add(int data) {

		TreeNode newNode = new TreeNode(data);
		if (root == null) {
			root = newNode;
		} else {

			TreeNode temp = root;

			TreeNode parentNode = root;

			while (temp != null) {

				parentNode = temp;

				if (data < temp.data) {
					temp = temp.leftNode;
				} else {
					temp = temp.rightNode;
				}
			}

			if (data < parentNode.data) {
				parentNode.leftNode = newNode;
			} else {
				parentNode.rightNode = newNode;
			}

		}
		return root;
	}

	public void inOrderTraversal(TreeNode rootNode) {

		if (rootNode != null) {

			inOrderTraversal(rootNode.leftNode);

			System.out.println(rootNode.data);

			inOrderTraversal(rootNode.rightNode);
		}

	}

	public List<Integer> inorderTraversal(TreeNode rootNode, List<Integer>list) {

		

		if (rootNode != null) {

			inorderTraversal(rootNode.leftNode,list);

			list.add(rootNode.data);

			inorderTraversal(rootNode.rightNode,list);
		}

		return list;

	}
	
public List<Integer> preorderTraversal(TreeNode rootNode, List<Integer>list) {

		

		if (rootNode != null) {
			
			list.add(rootNode.data);
			preorderTraversal(rootNode.leftNode,list);

			preorderTraversal(rootNode.rightNode,list);
		}

		return list;

	}


}
