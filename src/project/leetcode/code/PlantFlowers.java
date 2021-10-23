package project.leetcode.code;

public class PlantFlowers {

	public static void main(String[] args) {

		int[] flowerbed = { 0,0,1,0,0};
		
		int[] flowerbedDummy=new int[flowerbed.length];
		
		int count=0;
		for (int i = 0; i < flowerbed.length; i++) {

			int prev = i - 1;
			int next = i + 1;
			
			
			 if(prev < 0 && next>=flowerbed.length){
	                if(flowerbed[i]!=1)count++;
	          }if (prev < 0 && next < flowerbed.length) {
					
				if(flowerbed[i]!=1 && flowerbed[i+1]!=1) {
					
				count++;
				flowerbed[i]=1;
				}
				
			}else if(next>=flowerbed.length) {
				
				if(flowerbed[i]!=1 && flowerbed[i-1]!=1) {
					count++;
					flowerbed[i]=1;
				}
			}else if(flowerbed[i-1]!=1 && flowerbed[i]!=1 && flowerbed[i+1]!=1) {
				count++;
				flowerbed[i]=1;
			}
			
			
			
			
			
		}
		
		System.out.println(count);
	}

}
