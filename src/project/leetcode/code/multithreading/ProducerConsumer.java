package project.leetcode.code.multithreading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumer {

	public static void main(String[] args) throws InterruptedException {

		int MAX_SIZE = 1;
		Queue<Integer> sharedObject = new LinkedList<>();
		Random random = new Random();

		Runnable producer = new Runnable() {

			@Override
			public void run() {

				while (true) {

					synchronized (sharedObject) {

						if (sharedObject.isEmpty()) {

							int n = random.nextInt(10 - 1 + 1) + 1;

							sharedObject.add(n);
							System.out.println("Produces = " + n);

							try {
								Thread.sleep(1000);
								sharedObject.notifyAll();
								sharedObject.wait();
							} catch (InterruptedException e) {

								e.printStackTrace();
							}
						} else {
							sharedObject.notifyAll();
						}
					}

				}

			}
		};

		Runnable consumer = new Runnable() {

			@Override
			public void run() {
				while (true) {

					synchronized (sharedObject) {
						if (sharedObject.size() == MAX_SIZE) {
							int n = sharedObject.poll();
							System.out.println("Consemd = " + n);

							sharedObject.notifyAll();
						} else {
							try {
								Thread.sleep(1000);
								sharedObject.wait();
							} catch (InterruptedException e) {

								e.printStackTrace();
							}
						}
					}

				}
			}
		};

		new Thread(producer).start();
		new Thread(consumer).start();
	}

}
