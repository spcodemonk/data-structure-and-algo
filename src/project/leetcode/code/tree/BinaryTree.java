package project.leetcode.code.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.Collectors;

public class BinaryTree {

	TreeNode root;

	int sumOflestLeavesVal;

	TreeNode sesrchNode = null;

	// insert element in binary tree
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

	// Sum of values left leaf
	public int sumOfLeftlevesResult(TreeNode rootNode) {
		sumOfLeftleves(rootNode);
		return sumOflestLeavesVal;
	}

	public int sumOfLeftleves(TreeNode rootNode) {

		if (rootNode == null)
			return 0;

		if (isLeafNode(rootNode.leftNode)) {
			sumOflestLeavesVal += rootNode.leftNode.data;
		}

		return sumOfLeftleves(rootNode.leftNode) + sumOfLeftleves(rootNode.rightNode);

	}

	public boolean isLeafNode(TreeNode rootNode) {
		if (rootNode == null)
			return false;

		if (rootNode.leftNode == null && rootNode.rightNode == null) {
			return true;
		}
		return false;
	}

	// Count total leaf nodes
	public int numberOfLeafNodesTotal(TreeNode rootNode) {

		return numberOfLeafNodes(rootNode);
	}

	public int numberOfLeafNodes(TreeNode rootNode) {

		if (rootNode == null)
			return 0;

		if (isLeafNode(rootNode)) {
			return 1;
		}

		return numberOfLeafNodes(rootNode.leftNode) + numberOfLeafNodes(rootNode.rightNode);
	}

	public int numberOfLeafNodesTotalWithStack(TreeNode rootNode) {

		return numberOfLeafNodes(rootNode);
	}

	public int numberOfLeafNodesWithStack(TreeNode rootNode) {

		int count = 0;
		Stack<TreeNode> data = new Stack<>();

		data.add(rootNode);
		while (!data.isEmpty()) {
			TreeNode node = data.pop();

			if (node.leftNode != null) {
				data.add(node.leftNode);
			}

			if (node.rightNode != null) {
				data.add(node.rightNode);
			}

			if (isLeafNode(rootNode)) {
				count++;
			}
		}

		return count;
	}

	// Search in binary search tree
	public TreeNode searchinBinarySearchTree(TreeNode rootNode, int value) {
		searchNode(rootNode, value);
		return sesrchNode;
	}

	public void searchNode(TreeNode rootNode, int value) {

		if (rootNode != null) {

			if (rootNode.data == value) {
				System.out.println("ELEMENT found ");
				sesrchNode = rootNode;
				return;
			}
			searchNode(rootNode.leftNode, value);
			searchNode(rootNode.rightNode, value);
		}

	}

	public void inOrderTraversal(TreeNode rootNode) {

		if (rootNode != null) {

			inOrderTraversal(rootNode.leftNode);

			System.out.println(rootNode.data);

			inOrderTraversal(rootNode.rightNode);
		}

	}

	// Depth first search using stack
	public void depthFirstSearchTraverslaWithStack(TreeNode rootNode) {

		System.out.println("------------------------------");
		Stack<TreeNode> data = new Stack<>();
		data.add(rootNode);

		while (!data.isEmpty()) {
			TreeNode node = data.pop();

			if (node.rightNode != null) {
				data.add(node.rightNode);
			}
			if (node.leftNode != null) {
				data.add(node.leftNode);
			}

			System.out.println(node.data);

		}

	}

	// breadth first search suing queue
	public void bredthFirstSearch(TreeNode rootNode) {
		System.out.println("------------------------------");
		Queue<TreeNode> data = new ArrayDeque<>();

		data.add(rootNode);

		while (!data.isEmpty()) {
			TreeNode node = data.remove();

			if (node.leftNode != null) {
				data.add(node.leftNode);
			}

			if (node.rightNode != null) {
				data.add(node.rightNode);
			}
			System.out.println(node.data);
		}
	}

	// left most node in a tree
	public void leftMostNodeInLastRwo(TreeNode rootNode) {
		System.out.println("------------------------------");
		Queue<TreeNode> data = new ArrayDeque<>();

		data.add(rootNode);

		TreeNode left = null;
		while (!data.isEmpty()) {
			TreeNode node = data.remove();

			if (node.leftNode != null) {
				left = node.leftNode;
				data.add(node.leftNode);
			}

			if (node.rightNode != null) {
				data.add(node.rightNode);
			}

		}
		System.out.println(left.data);
	}

	public List<Integer> inorderTraversal(TreeNode rootNode, List<Integer> list) {

		if (rootNode != null) {

			inorderTraversal(rootNode.leftNode, list);

			list.add(rootNode.data);

			inorderTraversal(rootNode.rightNode, list);
		}

		return list;

	}

	public StringBuilder SameTree(TreeNode rootNode, StringBuilder sbd) {

		if (rootNode != null) {

			SameTree(rootNode.leftNode, sbd);

			sbd.append(rootNode.data);

			SameTree(rootNode.rightNode, sbd);
		}

		return sbd;

	}

	public List<Integer> preorderTraversal(TreeNode rootNode, List<Integer> list) {

		if (rootNode != null) {

			list.add(rootNode.data);
			preorderTraversal(rootNode.leftNode, list);

			preorderTraversal(rootNode.rightNode, list);
		}

		return list;

	}

	// find max height/depth of tree
	public int findHeightOrDepthOfTree(TreeNode rootNode) {

		if (rootNode == null) {
			return 0;
		}

		int depthl = findHeightOrDepthOfTree(rootNode.leftNode);

		int depthr = findHeightOrDepthOfTree(rootNode.rightNode);

		return Math.max(depthl, depthr) + 1;

	}

	// find min depth of tree
	public int findminDepthOfTree(TreeNode rootNode) {

		if (rootNode == null) {
			return 0;
		}

		if (rootNode.leftNode == null && rootNode.rightNode == null)
			return 1;

		int depthl = Integer.MAX_VALUE, depthr = Integer.MAX_VALUE;

		depthl = findminDepthOfTree(rootNode.leftNode);

		depthr = findminDepthOfTree(rootNode.rightNode);

		return Math.min(depthl, depthr) + 1;
	}

	// Coult all nodes having 2 child nodes
	public int countFullNodesInTree(TreeNode rootNode) {

		int count = 0;
		if (rootNode == null) {
			return 0;
		}

		if (rootNode.leftNode != null && rootNode.rightNode != null) {
			count++;
		}

//		int depthl = countAllNodes(rootNode.leftNode);
//		
//		int depthr =  countAllNodes(rootNode.rightNode);
		count += countFullNodesInTree(rootNode.leftNode) + countFullNodesInTree(rootNode.rightNode);

		return count;
	}

	// find all nodes of tree
	public int countAllNodesOfTree(TreeNode rootNode) {
		int count = 0;
		if (rootNode == null) {
			return 0;
		} else {
			count++;
		}

		count += countAllNodesOfTree(rootNode.leftNode) + countAllNodesOfTree(rootNode.rightNode);
		return count;

	}

	// bottom view of a binary tree
	public void bottomViewOfBinaryTree(TreeNode rootNode) {

		Map<Integer, Integer> data = new HashMap<>();

		Queue<TreeNode> queue = new ArrayDeque<>();

		int hd = 0;
		rootNode.hd = hd;
		queue.add(rootNode);

		while (!queue.isEmpty()) {

			TreeNode node = queue.remove();

			data.put(node.hd, node.data);

			if (node.leftNode != null) {
				node.leftNode.hd = node.hd - 1;
				queue.add(node.leftNode);
			}

			if (node.rightNode != null) {
				node.rightNode.hd = node.hd + 1;
				queue.add(node.rightNode);
			}

		}

		data.entrySet().stream().forEach(entry -> System.out.println(entry.getValue()));

	}
	
	//Top view of binary treee
	public void topViewOfBinaryTree(TreeNode rootNode) {
		Map<Integer, List<Integer>> data = new HashMap<>();

		Queue<TreeNode> queue = new ArrayDeque<>();

		int hd = 0;
		rootNode.hd = hd;
		queue.add(rootNode);

		while (!queue.isEmpty()) {

			TreeNode node = queue.remove();

			if (data.containsKey(node.hd)) {
				List<Integer> tmpList = data.get(node.hd);
				tmpList.add(node.data);
				data.put(node.hd, tmpList);
			} else {
				List<Integer> tmpList = new ArrayList<>();
				tmpList.add(node.data);
				data.put(node.hd, tmpList);
			}

			if (node.leftNode != null) {
				node.leftNode.hd = node.hd - 1;
				queue.add(node.leftNode);
			}

			if (node.rightNode != null) {
				node.rightNode.hd = node.hd + 1;
				queue.add(node.rightNode);
			}

		}



		List<Integer> dt = data.entrySet().stream().map(entry -> {
			return entry.getValue().get(0);
		}).collect(Collectors.toList());

		System.out.println(dt);
	}
	
	//Left view of a tree 
	public void leftViewOfATree(TreeNode rootNode) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		Map<Integer,List<Integer>> data = new HashMap<>();
		int level=0;
		queue.add(rootNode);
		queue.add(null);
		
		ArrayList<Integer> lst = new ArrayList<>();
		data.put(level, lst);
		
		
		StringBuilder sb = new StringBuilder();
		while (!queue.isEmpty() ) {

			TreeNode node = queue.remove();
			if(node==null) {
				if(queue.peek()==null) {
					break;
				}
				queue.add(null);
				level=level+1;
				lst = new ArrayList<>();
				data.put(level, lst);
			}else {
					lst = (ArrayList<Integer>) data.get(level);
					lst.add(node.data);
				data.put(level, lst);
			}
			
			if (node != null && node.leftNode != null) {
				queue.add(node.leftNode);
			}

			if (node != null && node.rightNode != null) {
				queue.add(node.rightNode);
			}

		}
		List<Integer> dt = data.entrySet().stream().map(entry -> {
			return entry.getValue().get(0);
		}).collect(Collectors.toList());
		
		System.out.println(dt);
	}
	
	//right view of a binary tree 
	public void rightViewOfATree(TreeNode rootNode) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		Map<Integer,List<Integer>> data = new HashMap<>();
		int level=0;
		queue.add(rootNode);
		queue.add(null);
		
		ArrayList<Integer> lst = new ArrayList<>();
		data.put(level, lst);
		
		
		StringBuilder sb = new StringBuilder();
		while (!queue.isEmpty() ) {

			TreeNode node = queue.remove();
			if(node==null) {
				if(queue.peek()==null) {
					break;
				}
				queue.add(null);
				level=level+1;
				lst = new ArrayList<>();
				data.put(level, lst);
			}else {
					lst = (ArrayList<Integer>) data.get(level);
					lst.add(node.data);
				data.put(level, lst);
			}
			
			if (node != null && node.leftNode != null) {
				queue.add(node.leftNode);
			}

			if (node != null && node.rightNode != null) {
				queue.add(node.rightNode);
			}

		}
		List<Integer> dt = data.entrySet().stream().map(entry -> {
			return entry.getValue().get(entry.getValue().size()-1);
		}).collect(Collectors.toList());
		
		System.out.println(dt);
	}

	//Find Largest Value in Each Tree Row
	public void largestValueInEachRow(TreeNode rootNode) {
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		Map<Integer,List<Integer>> data = new HashMap<>();
		int level=0;
		queue.add(rootNode);
		queue.add(null);
		
		ArrayList<Integer> lst = new ArrayList<>();
		data.put(level, lst);
		
		
		StringBuilder sb = new StringBuilder();
		while (!queue.isEmpty() ) {

			TreeNode node = queue.remove();
			if(node==null) {
				if(queue.peek()==null) {
					break;
				}
				queue.add(null);
				level=level+1;
				lst = new ArrayList<>();
				data.put(level, lst);
			}else {
					lst = (ArrayList<Integer>) data.get(level);
					lst.add(node.data);
				data.put(level, lst);
			}
			
			if (node != null && node.leftNode != null) {
				queue.add(node.leftNode);
			}

			if (node != null && node.rightNode != null) {
				queue.add(node.rightNode);
			}

		}
		List<Integer> dt = data.entrySet().stream().map(entry -> {
			return entry.getValue().stream().sorted().collect(Collectors.toList()).get(entry.getValue().size()-1);
		}).collect(Collectors.toList());
		
		System.out.println(dt);
	}
	
	//Even Odd Tree
public void evenOddTree(TreeNode rootNode) {
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		Map<Integer,List<Integer>> data = new HashMap<>();
		int level=0;
		queue.add(rootNode);
		queue.add(null);
		
		ArrayList<Integer> lst = new ArrayList<>();
		data.put(level, lst);
		
		
		StringBuilder sb = new StringBuilder();
		while (!queue.isEmpty() ) {

			TreeNode node = queue.remove();
			if(node==null) {
				if(queue.peek()==null) {
					break;
				}
				queue.add(null);
				level=level+1;
				lst = new ArrayList<>();
				data.put(level, lst);
			}else {
					lst = (ArrayList<Integer>) data.get(level);
					lst.add(node.data);
				data.put(level, lst);
			}
			
			if (node != null && node.leftNode != null) {
				queue.add(node.leftNode);
			}

			if (node != null && node.rightNode != null) {
				queue.add(node.rightNode);
			}

		}
		
		
		
		for (Map.Entry<Integer, List<Integer>> entry : data.entrySet()) {

			int treeLevel = entry.getKey();
			List<Integer> levelList = entry.getValue();
			if (treeLevel % 2 == 0) {
				int prevEven = Integer.MIN_VALUE;
				for (int i = 0; i < levelList.size(); i++) {
					int val = levelList.get(i);

					if ((val <= prevEven) || val % 2 == 0) {
						System.out.println(false);
					}
					prevEven = val;
				}
			} else {
				int prevOdd = Integer.MAX_VALUE;
				for (int i = 0; i < levelList.size(); i++) {
					int val = levelList.get(i);

					if ((val >= prevOdd) || val % 2 != 0) {
						System.out.println(false);
					}
					prevOdd = val;
				}
			}
		}
		System.out.println(true);
    }
//		List<Integer> dt = data.entrySet().stream().map(entry -> {
//			return entry.getValue().stream().sorted().collect(Collectors.toList()).get(entry.getValue().size()-1);
//		}).collect(Collectors.toList());
//		
//		System.out.println(dt);

	// vertical order traversal of binary tree
	public void levlOrderTraversalBinaryTree(TreeNode rootNode) {

		Map<Integer, List<Integer>> data = new HashMap<>();

		Queue<TreeNode> queue = new ArrayDeque<>();

		int hd = 0;
		rootNode.hd = hd;
		queue.add(rootNode);

		while (!queue.isEmpty()) {

			TreeNode node = queue.remove();

			if (data.containsKey(node.hd)) {
				List<Integer> tmpList = data.get(node.hd);
				tmpList.add(node.data);
				data.put(node.hd, tmpList);
			} else {
				List<Integer> tmpList = new ArrayList<>();
				tmpList.add(node.data);
				data.put(node.hd, tmpList);
			}

			if (node.leftNode != null) {
				node.leftNode.hd = node.hd - 1;
				queue.add(node.leftNode);
			}

			if (node.rightNode != null) {
				node.rightNode.hd = node.hd + 1;
				queue.add(node.rightNode);
			}

		}

//		data.entrySet().stream().forEach(entry -> System.out.println(entry.getValue()));

		List<List<Integer>> dt = data.entrySet().stream().map(entry -> {
			List<Integer> lst = new ArrayList<>();

			lst.addAll(entry.getValue());
			return lst.stream().sorted().collect(Collectors.toList());
		}).collect(Collectors.toList());

		System.out.println(dt);

	}
	
	//level order traversal
	public void levelOrderTraversal(TreeNode rootNode) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		Map<Integer,List<Integer>> data = new HashMap<>();
		int level=0;
		queue.add(rootNode);
		queue.add(null);
		
		ArrayList<Integer> lst = new ArrayList<>();
		data.put(level, lst);
		
		
		StringBuilder sb = new StringBuilder();
		while (!queue.isEmpty() ) {

			TreeNode node = queue.remove();
			if(node==null) {
				if(queue.peek()==null) {
					break;
				}
				queue.add(null);
				level=level+1;
				lst = new ArrayList<>();
				data.put(level, lst);
			}else {
					lst = (ArrayList<Integer>) data.get(level);
					lst.add(node.data);
				data.put(level, lst);
			}
			
			if (node != null && node.leftNode != null) {
				queue.add(node.leftNode);
			}

			if (node != null && node.rightNode != null) {
				queue.add(node.rightNode);
			}

		}
		
//		data.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() +" ---> "+entry.getValue()) );
		
		List<List<Integer>> dt = data.entrySet().stream().map(entry -> {
			List<Integer> lst1 = new ArrayList<>();

			lst1.addAll(entry.getValue());
			return lst1;
		}).collect(Collectors.toList());

		System.out.println(dt);

	}
	

	public boolean symetricTree(TreeNode root1, TreeNode root2) {

		int count = 0;
		Stack<TreeNode> data = new Stack<>();
		Stack<TreeNode> data2 = new Stack<>();

		data.add(root1);
		data2.add(root2);
		while (!data.isEmpty() && !data2.isEmpty()) {
			TreeNode node = data.pop();
			TreeNode node2 = data2.pop();

			if (!(node.leftNode != null && node2.leftNode != null && node.leftNode.data == node2.leftNode.data)) {
				return false;
			}
			if (node.leftNode != null) {
				data.add(node.leftNode);
			}

			if (!(node.rightNode != null && node2.rightNode != null && node.rightNode.data == node2.rightNode.data)) {
				return false;
			}
			if (node.rightNode != null) {
				data.add(node.rightNode);
			}
		}

		System.out.println("proccessing done" + data.size());

		return true;

	}
	public int sumOfAllNodes(TreeNode rootNode) {
		
		if(rootNode==null) {
			return 0;
		}		

		return rootNode.data + (sumOfAllNodes(rootNode.leftNode) + sumOfAllNodes(rootNode.rightNode));

	}

}
