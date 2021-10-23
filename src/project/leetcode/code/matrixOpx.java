package project.leetcode.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class matrixOpx {

	public static void main(String[] args) {
		
		int[][] matrix = {
							{1,1,1},
							{1,0,1},
							{1,1,1}
						};
		
//		int[][] matrix = {
//							{0,1,2,0},
//							{3,4,5,2},
//							{1,3,1,5}
//						};
		
		
		HashMap<Integer, List<Integer>> mapData = new HashMap<>();
		
		int i_index=-1;
		int j_index=-1;
		
		int pairCount=0;
		boolean flag =false;
		for(int i=0;i<matrix.length;i++) {
			
			for(int j=0;j<matrix[i].length;j++) {
				
				if(matrix[i][j]==0) {
					
					ArrayList<Integer> list = new ArrayList<>();
					list.add(i);
					list.add(j);
					mapData.put(pairCount++, list);
				}
				
			}
			
		}
		
		for (Map.Entry<Integer, List<Integer>> entry : mapData.entrySet()) {
			
			i_index=entry.getValue().get(0);
			j_index=entry.getValue().get(1);
			// horizontal update
			for (int k = 0; k < matrix[i_index].length; k++) {

				matrix[i_index][k] = 0;

			}

			// vertical update
			for (int l = 0; l < matrix.length; l++) {

				matrix[l][j_index] = 0;

			}
		}
		
		
		for(int i=0;i<matrix.length;i++) {
			
			for(int j=0;j<matrix[i].length;j++) {
				
				System.out.print(matrix[i][j]+",");
				
			}
			System.out.println();
		}
		
			
	
	}

}
