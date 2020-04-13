package thread;

public class ClasseB implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Io sono la classe classeB\t" + Thread.currentThread().getName());
		
		Thread b1 = new Thread(new B());
		Thread b2 = new Thread(new B());
		
		b1.start();
		b2.start();
	}

}
