package project.leetcode.code.part.two;

public class CountNegativeNumbersinaSortedMatrix {

	public static void main(String[] args) {
		int [][]  grid = {
							{4,3,2,-1},
							{3,2,1,-1},
							{1,1,-1,-2},
							{-1,-1,-2,-3}
						};
		
		int count=0;
		for(int [] row:grid) {
			count=count+processRow(row);
		}
		
		System.out.println(count);
		}

	private static int processRow(int[] row) {
		
		int lo=0;
		int high=row.length-1;
		while(lo<=high) {
			
			int mid = lo+(high-lo)/2;
			
			if(row[mid]<0) {
				high=mid-1;
			}else {
				lo=mid+1;
			}
		}
		return row.length-lo;
	}

	}