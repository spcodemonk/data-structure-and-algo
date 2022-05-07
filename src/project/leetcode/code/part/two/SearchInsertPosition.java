package project.leetcode.code.part.two;

public class SearchInsertPosition {

	public static void main(String[] args) {
			int nums[] = {1,3,5,6}; 
			int target = 2;
			
			int low=0;
			int end=nums.length-1;
			
			while(low<=end) {
				
				int mid = (low+end)/2;
				
				if(nums[mid]==target) {
					System.out.println("found "+ mid);
					break;
					
				}
				if(target>nums[mid]) {
					low=mid+1;
				}
				
				if(target<nums[mid]) {
					end=mid-1;
				}
				
			}
			
System.out.println(low);
	}

}
