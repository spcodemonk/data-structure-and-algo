package project.leetcode.code;

import java.util.HashSet;
import java.util.Set;

public class Comapre2Numbers {

	public static void main(String[] args) {
		int arr[] = { 10, 2, 5, 3 };
//    for(int i=0;i<arr.length;i++){
//            
//            for(int j=i+1;j<arr.length;j++){
//                
//                if(arr[i]==arr[j]*2 ||(((arr[j]/2) ==arr[i]) && (arr[j]%2) ==0)){
//
//                   System.out.println(true);
//                }
//            }
//        }

		Set<Integer> data = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			
			if(data.contains(arr[i*2]) || (data.contains(arr[i]/2)&& arr[i]%2==0)) {
				 System.out.println(true);
			}

			data.add(arr[i]);

		}

		System.out.println(false);
	}

}
