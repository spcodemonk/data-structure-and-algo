package project.leetcode.code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DIffOfTwoArrs {

	public static void main(String[] args) {


		int[] nums1 = {1,2,3,3}, nums2 = { 1,1,2,2 };
		
		List<List<Integer>> finalResult = new ArrayList<List<Integer>>();
		List<Integer> list1 = new ArrayList<>();

		Set<Integer> dataSet = new HashSet<>();

		dataSet = findDiff(nums1, dataSet);

		for (int i = 0; i < nums2.length; i++) {

			if (!dataSet.contains(nums2[i]) && !list1.contains(nums2[i])) {
				list1.add(nums2[i]);
			}
		}
		
		dataSet.clear();
		List<Integer>  list2 = new ArrayList<>();
		dataSet = findDiff(nums2, dataSet);
		for (int i = 0; i < nums1.length; i++) {

			if (!dataSet.contains(nums1[i]) && !list2.contains(nums1[i])) {
				list2.add(nums1[i]);
				
			}
		}
		
		finalResult.add(list2);
		finalResult.add(list1);

		System.out.println(finalResult);
	}

	private static Set<Integer> findDiff(int[] source, Set<Integer> dataSet) {

		for (int i = 0; i < source.length; i++) {
			dataSet.add(source[i]);
		}
		return dataSet;

	}
}
