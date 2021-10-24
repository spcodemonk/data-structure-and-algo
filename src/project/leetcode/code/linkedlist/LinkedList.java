package project.leetcode.code.linkedlist;

public class LinkedList {

	private Node head;

	public LinkedList() {
		this.head = null;
	}

//Insert node in the list 	
	public Node insertAtHead(int data) {

		Node temp = new Node(data);
		if (head == null) {
			head = temp;
		} else {

			temp.next = head;

			head = temp;
		}
		return head;
	}

//Print list
	public void print() {

		Node temp = head;

		StringBuilder sbd = new StringBuilder();
		while (temp != null) {
			sbd.append(temp.data + ", ");

			temp = temp.next;
		}
		System.out.println((sbd.toString().substring(0, sbd.length() - 2)));
	}

	// Print list1
	public void print(Node head) {

		Node temp = head;

		StringBuilder sbd = new StringBuilder();
		while (temp != null) {
			sbd.append(temp.data + ", ");

			temp = temp.next;
		}
		System.out.println((sbd.toString().substring(0, sbd.length() - 2)));
	}

//Find middle of the list
	public void findMiddle() {
		Node temp = head;
		Node temp1 = head;
		int count = 1;
		Node prev = null;
		while (temp1 != null && temp1.next != null) {
			count++;
			prev = temp;
			temp = temp.next;
			temp1 = temp1.next.next;
		}

		System.out.println("Your midle element : " + temp.data);
		prev.next = temp.next;

//		int middle= count/2;
//		Node temp1 = head;
//		 count=1;
//		while(temp1!=null) {
//			
//			if(count==middle) {
//				System.out.println("Your midle element : "+temp1.data);
//			}
//			count++;
//			temp1=temp1.next;
//		}

	}

//Remove duplicate from lsit
	public void removeDuplicate() {
		Node i = head;

		while (i != null) {

			Node j = i;

			while (j.next != null) {

				if (i.data == j.next.data) {
					j.next = j.next.next;
				} else {
					j = j.next;
				}

			}

			i = i.next;
		}

	}

//Sort the list
	public void sortLinedList() {

		Node i = head;

		for (; i != null; i = i.next) {

			for (Node j = i.next; j != null; j = j.next) {

				if (i.data > j.data) {
					int data = i.data;
					i.data = j.data;
					j.data = data;
				}

			}
		}

	}

//find the nth Node form linkedlist

	public void findNthNodeFromLinkedList() {

		Node i = head;

		Node j = i;

		int n = 4;
		int count = 1;
		while (count <= n - 1) {

			j = j.next;
			count++;
		}

		while (j.next != null) {

			j = j.next;
			i = i.next;
		}

		System.out.println(i.data);
	}

//Remove the nth node from linkedlist
	public void removeNthNodeFromLinkedList() {
		Node i = head;

		Node j = i;

		int n = 4;
		int count = 1;
		while (count <= n - 1) {

			j = j.next;
			count++;
		}

		Node prev = null;
		while (j.next != null) {

			prev = i;

			j = j.next;
			i = i.next;
		}
		prev.next = i.next;
	}

//Check if there is a cycle or not in LinkedList

	public void checkCycle() {

		Node i = head;
		Node j = i;
		while (j.next.next != null) {

			if (i == j) {
				System.out.println("There is a loop");
				break;
			}
			j = j.next.next;
			i = i.next;
		}

	}

	// Reverse a LinkedList
	public Node reverseLinkedList() {
		Node currentNode = head, nextNode = head;

		Node prev = null;

		while (nextNode.next != null) {
			nextNode = nextNode.next;

			currentNode.next = prev;

			prev = currentNode;

			currentNode = nextNode;

		}
		currentNode.next = prev;

		return currentNode;
	}

	// Merge 2 sorted lists
	public static Node MergeSortedLists(LinkedList list, LinkedList list2) {

		Node p = list.head;
		Node q = list2.head;

		Node sortedHead = null;
		Node sorted = null;
		if (p.data < q.data) {
			sorted = p;
			p = p.next;
		} else {
			sorted = q;
			q = q.next;
		}

		sortedHead = sorted;

		while (p != null && q != null) {

			if (p.data < q.data) {

				sorted.next = p;
				sorted = p;
				p = p.next;
			} else {
				sorted.next = q;
				sorted = q;
				q = q.next;
			}
		}

		if (p == null) {
			sorted.next = q;
		}

		if (q == null) {
			sorted.next = p;
		}
		return sortedHead;

	}

// Find sum of all elements in linkedList
	public void sumOflinkedList(LinkedList list) {
		int sum = findSum(list.head);
		System.out.println("LinkedList sum is : " + sum);
	}

	// Recursive find sum of all elements
	public int findSum(Node node) {

		if (node == null)
			return 0;

		return node.data + findSum(node.next);
	}

	// recursive element search in list

	public void recursiveSearch(int value) {

		Node temp = head;

		Node n = recursiveSearch1(temp, value);

		if (n == null) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found : " + n.data);
		}
	}

	public Node recursiveSearch1(Node node, int value) {

		if (node == null)
			return null;

		if (node.data == value)
			return node;

		return recursiveSearch1(node.next, value);
	}

	// Check if list is palindrome or not

	public boolean palindromeCheck() {
		
		
		Node temp = head;

		//1. split the list
		Node p = temp;
		Node q = temp;

		Node secondListStart = null;
		while (true) {
			p = p.next.next;

			if (p.next == null) {
				secondListStart = q.next.next;
				break;
			}

			if (p == null) {
				secondListStart = q.next;
				break;
			}
			q = q.next;

		}

		q.next = null;
		
		//2. reverse second list
		
		Node currentNode = secondListStart, nextNode = secondListStart;

		Node prev = null;

		while (nextNode.next != null) {
			nextNode = nextNode.next;

			currentNode.next = prev;

			prev = currentNode;

			currentNode = nextNode;

		}
		currentNode.next = prev;
		
		//3. Now start comparing element of both the list from start
		boolean isPalindrome=true;
		temp = head;
		Node secondReversed = currentNode;
		while(temp!=null) {
			
			if(!(temp.data == secondReversed.data)) {
				isPalindrome=false;
			}
			
			temp=temp.next;
			secondReversed=secondReversed.next;
			
			
		}

		return isPalindrome;
	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.insertAtHead(1);
		list.insertAtHead(4);
		list.insertAtHead(3);
		list.insertAtHead(2);
		list.insertAtHead(1);

//		LinkedList list2 = new LinkedList();
//
//		list2.insertAtHead(7);
//		list2.insertAtHead(6);
//		list2.insertAtHead(5);
//		list2.insertAtHead(4);
//		list2.insertAtHead(2);

		System.out.println("-----------------Inupt-----------------------");
		list.print();

		System.out.println();
		boolean isPalindrome =  list.palindromeCheck();

		System.out.println("isPalindrome : "+isPalindrome);

//		list2.print();
//		
//		System.out.println("-----------------Output----------------------");
//		
//		Node newList = MergeSortedLists(list,list2);
////		Node newList = list.reverseLinkedList();
//		list.print(newList);

//		list.recursiveSearch(8);

	}

}
