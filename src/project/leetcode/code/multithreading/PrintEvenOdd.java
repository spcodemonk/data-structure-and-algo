package project.leetcode.code.multithreading;

import java.util.concurrent.atomic.AtomicBoolean;

public class PrintEvenOdd {

	public static void main(String[] args){

		AtomicBoolean EvenOddFlag = new AtomicBoolean(true);

		Runnable even = () -> {

			int i=0;
			while(i<=10) {
				
				if(EvenOddFlag.get()==true) {
					System.out.println("Even = "+i);
					i++;
					EvenOddFlag.set(false);
					sleepMyThread();
				}else {
					System.out.println("Odd = "+i);
					i++;
					EvenOddFlag.set(true);
					sleepMyThread();
				}
			}
		};
		
		new Thread(even).start();

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
