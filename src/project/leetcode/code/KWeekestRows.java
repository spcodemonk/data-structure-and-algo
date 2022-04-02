package project.leetcode.code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class KWeekestRows {

	public static void main(String[] args) {
		int[][] mat = { 
							{ 1, 1, 0, 0, 0 }, 
							{ 1, 1, 1, 1, 0 }, 
							{ 1, 0, 0, 0, 0 }, 
							{ 1, 1, 0, 0, 0 }, 
							{ 1, 1, 1, 1, 1 } };
		int k = 3;

		Comparator<Matrix> comp = new Comparator<Matrix>() {

			@Override
			public int compare(Matrix o1, Matrix o2) {

				if (o1.getSoldiers() < o2.getSoldiers()) {
					return -1;
				} else if (o1.getSoldiers() > o2.getSoldiers()) {
					return 1;
				}else {
					
					if(o1.getRow() < o2.getRow()) {
						return -1;
					}else {
						return 1;
					}
				} 
				
			}

		};
		
		Set<Matrix> list = new TreeSet<>(comp);
		for (int i = 0; i < mat.length; i++) {

			int soldierCountinaRow = 0;
			for (int j = 0; j < mat[i].length; j++) {

				if (mat[i][j] == 1) {
					soldierCountinaRow++;
				}
			}

			Matrix obj = new Matrix(i, soldierCountinaRow);
			list.add(obj);

			
		}
	

		int []arr=new int[k];
		
		
		int m=0;
		for(Matrix a :list) {
			
			if(m>=k) {
				break;
			}
			arr[m++]=a.getRow();
		}
		 
		System.out.println(Arrays.toString(arr));
		
	}

}

class Matrix {

	private int row;
	private int soldiers;

	public Matrix(int row, int soldiers) {
		super();
		this.row = row;
		this.soldiers = soldiers;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getSoldiers() {
		return soldiers;
	}

	public void setSoldiers(int soldiers) {
		this.soldiers = soldiers;
	}

}
