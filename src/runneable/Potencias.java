package runneable;

public class Potencias implements Runnable {
	
	private final int numero;
	
	Potencias(int numero){
		this.numero=numero;
	}
	
	
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println(Thread.currentThread()
                    .getName()+" "+numero+" ^"+i+" ="+Math.pow(numero, i));
		}
		
	}

}
