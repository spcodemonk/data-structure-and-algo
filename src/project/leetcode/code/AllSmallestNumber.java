package project.leetcode.code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AllSmallestNumber {

	public static void main(String[] args) {

		int[] nums = { 8, 1, 2, 2, 3 };
		
		int []nums1=nums;
		int arr[]=new int[nums.length];
		Arrays.sort(nums);
		
		System.out.println(Arrays.toString(nums));
		
		
		Map<Integer,Integer> data =new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			
			if(!data.containsKey(nums[i]))
			data.put(nums[i], i);
		}
		for(int i=0;i<nums1.length;i++) {
			
			arr[i]=data.get(nums1[i]);
		}
		System.out.println(Arrays.toString(arr));
	}
}
