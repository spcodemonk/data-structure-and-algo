package project.leetcode.code.multithreading;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class PrintEvenOdd {

	public static void main(String[] args){

		AtomicBoolean EvenOddFlag = new AtomicBoolean(true);
		
		AtomicInteger count = new AtomicInteger(0);
		Runnable even = () -> {

			while(count.get()<=10) {
				if(EvenOddFlag.get()==true ) {
					System.out.println("Even = "+count.getAndIncrement());
					
					EvenOddFlag.set(false);
					sleepMyThread();
				}
			}
			
		};
		
		Runnable odd = () -> {

			while(count.get()<=10) {
				if(EvenOddFlag.get()==false) {
					System.out.println("Odd = "+count.getAndIncrement());
					
					EvenOddFlag.set(true);
					sleepMyThread();
				}
			}
		
		};
		
		new Thread(even).start();	
		new Thread(odd).start();	
	}
	
	public static void sleepMyThread() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
