package project.leetcode.code;

public class SubArraySum {

	public static void main(String[] args) {
		int []nums ={10,20,30,5,10,50};
		 int finalBigResult=0;
		 int bigResult=0;
//	        for(int i=0;i<nums.length;i++){
	           
	             for(int j=1;j<nums.length;j++){
	                
	                 if(nums[j-1]<nums[j]){
	                     bigResult=bigResult+nums[j];
	                 }else{
	      
	                	 break;
	                	
	                 }
	            }
	             
	            finalBigResult=Math.max(finalBigResult,bigResult);
	            bigResult=0;
//	        }
	        
	        System.out.println(finalBigResult);

	}

}
