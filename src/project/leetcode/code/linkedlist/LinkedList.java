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
		
		sortedHead=sorted;

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
		
		if(p==null) {
			sorted.next=q;
		}
		
		if(q==null){
			sorted.next=p;
		}
		return sortedHead;

	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.insertAtHead(12);
		list.insertAtHead(8);
		list.insertAtHead(5);
		list.insertAtHead(3);
		list.insertAtHead(1);

		LinkedList list2 = new LinkedList();

		list2.insertAtHead(7);
		list2.insertAtHead(6);
		list2.insertAtHead(5);
		list2.insertAtHead(4);
		list2.insertAtHead(2);

		System.out.println("-----------------Inupt-----------------------");
		list.print();


		list2.print();
		
		System.out.println("-----------------Output----------------------");
		
		Node newList = MergeSortedLists(list,list2);
//		Node newList = list.reverseLinkedList();
		list.print(newList);

	}

}
