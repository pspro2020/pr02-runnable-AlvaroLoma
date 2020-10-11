package runneable;

import runneable.Potencias;

public class Main {

	public static void main(String[] args) {

		for (int i = 1; i < 11; i++) {
			Thread thread =new Thread(new Potencias(i));
			//new Potencias(i).start();
			
			if(i%2==0) {
			
				thread.setPriority(Thread.MAX_PRIORITY);
			}else {
				thread.setPriority(Thread.MIN_PRIORITY);
			}
			thread.start();
		}
	}

}
