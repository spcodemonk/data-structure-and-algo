package project.leetcode.code;

public class ConvertString {

	public static void main(String[] args) {
		String s = "a1b2c3d4e";

		char arr[] = s.toCharArray();

		for (int i = 1; i < arr.length; i+=2) {
				
			arr[i]=(char) (arr[i-1]+ Character.getNumericValue(arr[i]));
		}
		System.out.println(new String(arr));
	}	

}
