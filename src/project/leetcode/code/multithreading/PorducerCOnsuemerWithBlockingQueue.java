package project.leetcode.code.multithreading;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import javax.sql.rowset.serial.SQLOutputImpl;

public class PorducerCOnsuemerWithBlockingQueue {

	public static void main(String[] args) {
		
		BlockingQueue<Integer> queue =new LinkedBlockingQueue<>();
		Random random = new Random();
		
		Runnable producer = new Runnable() {
			
			@Override
			public void run() {
				
				while(true) {
				int n = random.nextInt(10 - 1 + 1) + 1;
				queue.add(n);
				System.out.println("Produced = "+n);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			}
		};
		
		Runnable consumer = new Runnable() {
			
			@Override
			public void run() {
				
				while(true) {
				
				
				try {
					int n = queue.take();
					System.out.println("Consumed = "+n);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}
		};
		
		
		new Thread(producer).start();
		new Thread(consumer).start();
	}

}
