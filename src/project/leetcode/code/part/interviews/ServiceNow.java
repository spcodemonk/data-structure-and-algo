package project.leetcode.code.part.interviews;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;

public class ServiceNow {

	public static void main(String[] args) {

		int n = 7;

		Set<Integer> uniqueElements = new HashSet<>();
		ArrayDeque<Integer> queue = new ArrayDeque<>();
		queue.addFirst(n);
		uniqueElements.add(n);
		while (!queue.isEmpty()) {
			n = queue.removeFirst();
			int i = 1;
			while (i < n) {

				if (n % i == 1) {
					uniqueElements.add(n - i);
					
					if(!queue.contains(n - i)) {
						queue.addLast(n-i);
					}
				}

				if (n - i == 1) {
					break;
				} else {
					i++;
				}
			}
		}
		System.out.println(uniqueElements);
	}

}
