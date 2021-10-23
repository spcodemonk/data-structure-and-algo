package project.leetcode.code;

public class BinaetSearch {

	public static void main(String[] args) {
		int arr[] = { 5, 7, 7, 8, 8, 10 };
		
		int target=7;
	
		searchBinary( 0,  arr.length,  arr,target);
		
	
		
	}
	
	public static void searchBinary(int first, int last, int arr[], int target) {
	
			
			if(first==last) {
				System.out.println("element not found");
				return;
			}
			int mid = (first+last)/2;
			
			if(arr[mid]==target ) {	
				System.out.println("element found");
				return;
			}else if(arr[mid]>target) {
				searchBinary( 0,  mid-1,  arr,target);
			}else if(arr[mid]<target) {
				searchBinary( mid+1,  arr.length,  arr,target);
			
			}
		
	}

}
