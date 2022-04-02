package project.leetcode.code;

public class BusStop {

	public static void main(String[] args) {
		
		int[]distance = {1,2,3,4};
		int start = 0;
		int destination = 2;
		

		int totalDistance=0;
		int clockWiseDistance=0;
		
		for(int i=0;i<distance.length;i++) {
			
			if(start< destination && (i>=start && i<destination)) {
				clockWiseDistance+=distance[i];
			}
			
			if(start >destination && (i>=start || i<destination)) {
				clockWiseDistance+=distance[i];
			}
			
			totalDistance+=distance[i];
		}
		
		System.out.println(Math.min(clockWiseDistance, totalDistance-clockWiseDistance));
	}

}
