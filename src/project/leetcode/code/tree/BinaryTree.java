package project.leetcode.code.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
	public void inOrderNonRecursive(TreeNode rootNode) {

		System.out.println("------------------------------");
		Stack<TreeNode> data = new Stack<>();

		TreeNode current = rootNode;

		while (current != null || !data.isEmpty()) {

			if (current != null) {

				data.add(current);
				current = current.leftNode;
			} else {
				TreeNode node = data.pop();
				current = node.rightNode;

				System.out.println(node.data);
			}

		}

	}

	// Kth Smallest Element in a BST
	public int kthSmallestElementinaBST(TreeNode rootNode) {

		Stack<TreeNode> data = new Stack<>();

		TreeNode current = rootNode;
		int count = 0;
		int k = 2;
		while (current != null || !data.isEmpty()) {

			if (current != null) {

				data.add(current);
				current = current.leftNode;
			} else {
				TreeNode node = data.pop();
				current = node.rightNode;

				++count;
				if (count == k) {
//					return node.data;
					System.out.println(node.data);
				}
//				System.out.println(node.data);
			}

		}

		return 0;
	}

	// Increasing Order Search Tree
	public TreeNode IncreasingOrderSearchTree(TreeNode rootNode) {

		System.out.println("------------------------------");
		Stack<TreeNode> data = new Stack<>();

		TreeNode current = rootNode;

		TreeNode newTree = new TreeNode(0);
		TreeNode temp = newTree;

		BinaryTree tree = new BinaryTree();
		while (current != null || !data.isEmpty()) {

			if (current != null) {

				data.add(current);
				current = current.leftNode;
			} else {
				TreeNode node = data.pop();
				current = node.rightNode;

				temp.rightNode = node;
				temp.leftNode = null;
				temp = temp.rightNode;
				System.out.println(node.data);
			}

		}
		System.out.println();
		return newTree.rightNode;
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

	// find min depth of tree
	public int findminDepthOfTree1(TreeNode rootNode) {

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

	// Top view of binary treee
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

	// Left view of a tree
	public void leftViewOfATree(TreeNode rootNode) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		Map<Integer, List<Integer>> data = new HashMap<>();
		int level = 0;
		queue.add(rootNode);
		queue.add(null);

		ArrayList<Integer> lst = new ArrayList<>();
		data.put(level, lst);

		StringBuilder sb = new StringBuilder();
		while (!queue.isEmpty()) {

			TreeNode node = queue.remove();
			if (node == null) {
				if (queue.peek() == null) {
					break;
				}
				queue.add(null);
				level = level + 1;
				lst = new ArrayList<>();
				data.put(level, lst);
			} else {
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

	// right view of a binary tree
	public void rightViewOfATree(TreeNode rootNode) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		Map<Integer, List<Integer>> data = new HashMap<>();
		int level = 0;
		queue.add(rootNode);
		queue.add(null);

		ArrayList<Integer> lst = new ArrayList<>();
		data.put(level, lst);

		StringBuilder sb = new StringBuilder();
		while (!queue.isEmpty()) {

			TreeNode node = queue.remove();
			if (node == null) {
				if (queue.peek() == null) {
					break;
				}
				queue.add(null);
				level = level + 1;
				lst = new ArrayList<>();
				data.put(level, lst);
			} else {
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
			return entry.getValue().get(entry.getValue().size() - 1);
		}).collect(Collectors.toList());
		
		
		System.out.println(dt);

		
		
		
	}
	
	// Binary Tree Level Order Traversal II
	public void levelOrderTraversal2(TreeNode rootNode) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		List<List<Integer>> result=new ArrayList<>();
		
		if(rootNode!=null) {
			queue.add(rootNode);
			
		}
		
		while(!queue.isEmpty()) {
			int size= queue.size();
			
			List<Integer> inner = new ArrayList<>();
			while(size>0) {
				
				TreeNode node = queue.remove();
				
				if(node.leftNode!=null) {
					queue.add(node.leftNode);
				}
				
				if(node.rightNode!=null) {
					queue.add(node.rightNode);
				}
				inner.add(node.data);
				size--;
			}
			result.add(inner);
			
			
		}
		Collections.reverse(result);
		System.out.println(result);
	}

	// ZIgZag Order traversal
	public void zigZackTraversal(TreeNode rootNode) {

		Queue<TreeNode> queue = new LinkedList<TreeNode>();

		queue.add(rootNode);
		queue.add(null);

		int level = 1;
		Map<Integer, List<Integer>> data = new HashMap<>();
		ArrayList<Integer> lst = new ArrayList<>();
		data.put(level, lst);

		while (!queue.isEmpty()) {

			TreeNode node = queue.remove();

			if (node == null) {

				List reverse = data.get(level);
				Collections.reverse(reverse);
				data.put(level, reverse);
				if (queue.peek() == null) {
					continue;// reached to end so, no need to process further
				}

				level = level + 1;
				queue.add(null);
				data.put(level, new ArrayList<>());
				continue;// if null element is there then move to next to next element after incrementing
							// the level
			} else {
				// for each level we have level as key ind value is all the elements in that
				// level in the form of arraylist
				List<Integer> list = data.get(level);
				list.add(node.data);
				data.put(level, list);
			}

			if (node.leftNode != null) {

				queue.add(node.leftNode);
			}

			if (node.rightNode != null) {
				queue.add(node.rightNode);
			}

		}

		List<List<Integer>> listData = new ArrayList<>();

		System.out.println(data.entrySet().stream().map(entry -> entry.getValue()).collect(Collectors.toList()));
//		System.out.println(data.toString());
		


	}

	// Average of Levels in Binary Tree
	public void averageOfLevel(TreeNode rootNode) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		Map<Integer, List<Integer>> data = new HashMap<>();
		int level = 0;
		queue.add(rootNode);
		queue.add(null);

		ArrayList<Integer> lst = new ArrayList<>();
		data.put(level, lst);

		List<Double> result = new ArrayList<>();
		while (!queue.isEmpty()) {

			TreeNode node = queue.remove();

			if (node == null) {
				lst = (ArrayList<Integer>) data.get(level);

				result.add(lst.stream().mapToInt(a -> a).average().getAsDouble());
				if (queue.peek() == null) {
					break;
				}

				queue.add(null);
				level = level + 1;
				lst = new ArrayList<>();
				data.put(level, lst);
			} else {
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

		System.out.println(result);

	}

	// Find Largest Value in Each Tree Row
	public void largestValueInEachRow(TreeNode rootNode) {

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		Map<Integer, List<Integer>> data = new HashMap<>();
		int level = 0;
		queue.add(rootNode);
		queue.add(null);

		ArrayList<Integer> lst = new ArrayList<>();
		data.put(level, lst);

		StringBuilder sb = new StringBuilder();
		while (!queue.isEmpty()) {

			TreeNode node = queue.remove();
			if (node == null) {
				if (queue.peek() == null) {
					break;
				}
				queue.add(null);
				level = level + 1;
				lst = new ArrayList<>();
				data.put(level, lst);
			} else {
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
			return entry.getValue().stream().sorted().collect(Collectors.toList()).get(entry.getValue().size() - 1);
		}).collect(Collectors.toList());

		System.out.println(dt);
	}

	// Even Odd Tree
	public void evenOddTree(TreeNode rootNode) {

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		Map<Integer, List<Integer>> data = new HashMap<>();
		int level = 0;
		queue.add(rootNode);
		queue.add(null);

		ArrayList<Integer> lst = new ArrayList<>();
		data.put(level, lst);

		StringBuilder sb = new StringBuilder();
		while (!queue.isEmpty()) {

			TreeNode node = queue.remove();
			if (node == null) {
				if (queue.peek() == null) {
					break;
				}
				queue.add(null);
				level = level + 1;
				lst = new ArrayList<>();
				data.put(level, lst);
			} else {
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

	// level order traversal
	public void levelOrderTraversal(TreeNode rootNode) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		Map<Integer, List<Integer>> data = new HashMap<>();
		int level = 0;
		queue.add(rootNode);
		queue.add(null);

		ArrayList<Integer> lst = new ArrayList<>();
		data.put(level, lst);

		while (!queue.isEmpty()) {

			TreeNode node = queue.remove();
			if (node == null) {
				if (queue.peek() == null) {
					break;
				}
				queue.add(null);
				level = level + 1;
				lst = new ArrayList<>();
				data.put(level, lst);
			} else {
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

	// Maximum Level Sum of a Binary Tree
	public void maxLevelSum(TreeNode rootNode) {
		Queue<TreeNode> queue = new LinkedList<>();

		Map<Integer, Integer> mapData = new HashMap<>();
		int level = 1;
		queue.add(rootNode);
		queue.add(null);

		while (!queue.isEmpty()) {

			TreeNode node = queue.remove();

			if (node != null) {

				mapData.put(level, (mapData.getOrDefault(level, 0) + node.data));

				if (node.leftNode != null) {
					queue.add(node.leftNode);
				}

				if (node.rightNode != null) {
					queue.add(node.rightNode);
				}
			} else {
				if (queue.peek() == null) {
					break;
				}

				level = level + 1;
				queue.add(null);

			}

		}

		System.out.println(Collections.max(mapData.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey());
		System.out.println(mapData);
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

		if (rootNode == null) {
			return 0;
		}

		return rootNode.data + (sumOfAllNodes(rootNode.leftNode) + sumOfAllNodes(rootNode.rightNode));

	}

	// check if both tree are same recursive
	public boolean checkSameTree(TreeNode rootNode1, TreeNode rootNode2) {

		if (rootNode1 == null && rootNode2 == null) {
			return true;
		}

		if (rootNode1 != null && rootNode2 != null) {

			if (rootNode1.data == rootNode2.data && checkSameTree(rootNode1.leftNode, rootNode2.leftNode)
					&& checkSameTree(rootNode1.rightNode, rootNode2.rightNode)) {
				return true;
			}
		}
		return false;
	}

	// check if both tree are symetric- mirror
	public boolean mirror(TreeNode rootNode1, TreeNode rootNode2) {

		if (rootNode1 == null && rootNode2 == null) {
			return true;
		}

		if (rootNode1 == null || rootNode2 == null) {
			return false;
		}

		if (rootNode1 != null && rootNode2 != null) {

			if (rootNode1.data == rootNode2.data && mirror(rootNode1.leftNode, rootNode2.rightNode)
					&& mirror(rootNode1.rightNode, rootNode2.leftNode)) {
				return true;
			}
		}
		return false;
	}

	// Univalued binary tree
	public boolean uniValuedTree(TreeNode rootNode1) {

		Stack<TreeNode> data = new Stack<>();

		data.add(rootNode1.leftNode);
		data.add(rootNode1.rightNode);

		int value = rootNode1.data;

		while (!data.isEmpty()) {

			TreeNode node = data.pop();

			if (node.data != value) {
				return false;
			}
			if (node.leftNode != null) {
				data.add(node.leftNode);
			}

			if (node.rightNode != null) {
				data.add(node.rightNode);
			}

		}

		return true;
	}

	// Leaf-Similar Trees
	public boolean leafSimilarTrees(TreeNode root1, TreeNode root2) {

		Stack<TreeNode> tree1 = new Stack<>();

		Queue<TreeNode> tree1Leaf = new ArrayDeque<>();

		tree1.add(root1);
		while (!tree1.isEmpty()) {

			TreeNode node = tree1.pop();

			if (node.leftNode != null) {
				tree1.add(node.leftNode);
			}

			if (node.rightNode != null) {
				tree1.add(node.rightNode);
			}

			if (node.leftNode == null && node.rightNode == null) {
				tree1Leaf.add(node);
			}
		}

		System.out.println(tree1Leaf.toString());
		Stack<TreeNode> tree2 = new Stack<>();

		tree2.add(root2);
		while (!tree2.isEmpty()) {

			TreeNode node = tree2.pop();

			if (node.leftNode != null) {
				tree2.add(node.leftNode);
			}

			if (node.rightNode != null) {
				tree2.add(node.rightNode);
			}

			if (node.leftNode == null && node.rightNode == null) {

				TreeNode temp = tree1Leaf.remove();

				if (temp.data != node.data)
					return false;
			}
		}

		return tree1Leaf.isEmpty();
	}

	// Search in binary search tree and return the tree from the node
	public TreeNode SearchInBinaryTree(TreeNode root, int val) {
		TreeNode node = null;

		if (root != null) {
			if (root.data == val) {
				return root;
			}

			node = SearchInBinaryTree(root.leftNode, val);
			if (node == null) {
				node = SearchInBinaryTree(root.rightNode, val);
			}
		}

		return node;
	}

	int sum = 0;

	public TreeNode inOrderTraversalForGreater(TreeNode rootNode) {

		if (rootNode != null) {
			inOrderTraversalForGreater(rootNode.rightNode);

			sum += root.data;
			root.data = sum;
//			 System.out.println(rootNode.data);
			inOrderTraversalForGreater(rootNode.leftNode);

		}

		return root;
	}

	// Binary Tree Paths
	public void binaryTreePaths(TreeNode root) {
		List<String> paths = new ArrayList<>();

		dfs(root, "", paths);
		System.out.println(paths);
	}

	private void dfs(TreeNode root, String path, List<String> paths) {
		path += root.data;

		if (root.leftNode == null && root.rightNode == null) {
			paths.add(path);
		}

		if (root.leftNode != null) {
			dfs(root.leftNode, path + "->", paths);
		}
		if (root.rightNode != null) {
			dfs(root.rightNode, path + "->", paths);
		}

	}

	// Maximum Depth of N-ary Tree
	public void maxiMumDepthOfNarTree(TreeNode root) {

		ArrayList<Integer> data = new ArrayList<>();

		int path = 0;
		dfs1(root, path, data);

		System.out.println(data);

		System.out.println(data.stream().mapToInt(a -> a).max().getAsInt());

	}

	private void dfs1(TreeNode root, int path, List<Integer> paths) {
		path += 1;

		if (root.leftNode == null && root.rightNode == null) {
			paths.add(path);
		}

		if (root.leftNode != null) {
			dfs1(root.leftNode, path, paths);
		}
		if (root.rightNode != null) {
			dfs1(root.rightNode, path, paths);
		}

	}

}
