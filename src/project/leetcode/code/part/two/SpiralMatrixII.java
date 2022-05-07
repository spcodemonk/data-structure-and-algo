package project.leetcode.code.part.two;

import java.util.Arrays;

public class SpiralMatrixII {

	public static void main(String[] args) {
		
		int nums[]=  {2,3,1,2};
		 int count =0;
	        int prevMax=Integer.MIN_VALUE;
	        
	        for(int i=1;i<nums.length;i++){
	            
	            if(nums[i-1]>nums[i] ){
	                count++;
	                prevMax = nums[i-1];
	            }
	            
	            if(count>1){
	                
	            	break;
	            }
	        }
	System.out.println(count);
	}

}
