package project.leetcode.code;

public class HouseRobber {

	public static void main(String[] args) {
		int columnNumber=52;
		StringBuilder columnName = new StringBuilder();
		while(columnNumber>0) {
			
			int reminder=columnNumber%26;
			
			 if (reminder == 0) {
	                columnName.append("Z");
	                columnNumber = (columnNumber / 26) - 1;
	               
	            }
			 
			 if(reminder==0) {
				 columnName.append((char)((reminder) + 'A'));
			 }else {
			 columnName.append((char)((reminder - 1) + 'A'));
			 }
			columnNumber = columnNumber / 26;
			
			
		}
		System.out.println();
		
//		String str = columnName.reverse().toString();
//		if(str.charAt(0)=='@')
//		System.out.println(str.substring(1, str.length()));

	}

}
