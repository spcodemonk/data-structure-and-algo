package project.leetcode.code;

public class MatrixDiagonalSum {

	public static void main(String[] args) {
		int [][]mat = {{5}
					 };
		
		
		int sumP=0;
		int sumS=0;
		
		int matLenght=(mat.length-1);
		for(int i=0;i<mat.length;i++) {
			
			
			sumP+=mat[i][i];
			if(!(i==(matLenght)-i))
			sumS+=mat[i][(matLenght)-i];
			
		}
		
		System.out.println(sumP);
		System.out.println(sumS);
		System.out.println(sumS+sumP);
		
	}

}
