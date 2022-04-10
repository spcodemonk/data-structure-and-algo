package project.leetcode.code;

public class CrawlerLogFolder {

	public static void main(String[] args) {

		String[] logs = {"d1/","d2/","./","d3/","../","d31/"};
		
		int count=0;
		for(int i=0;i<logs.length;i++) {
			
			if(logs[i].equals("../") && count !=0){
				count=count -1;
			}else if(!(logs[i].equals("./") || logs[i].equals("../"))) {
				count = count+1;
			}
		}
		System.out.println(count);
	}

}
