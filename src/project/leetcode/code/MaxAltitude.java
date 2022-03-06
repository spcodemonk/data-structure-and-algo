package project.leetcode.code;

public class MaxAltitude {

	public static void main(String[] args) {
		
		int [] gain = {-5,1,5,0,-7};

			
		int res=0;
		int sum=0;
		
		for(int i=0;i<gain.length;i++) {
			
			sum+=gain[i];
			
			res=Math.max(sum, res);
		}
		
		System.out.println(res);
	}

}
